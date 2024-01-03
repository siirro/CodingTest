class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagrams = {} 

        for str in strs:
            sort_str = ''.join(sorted(str))
            if sort_str not in anagrams: 
                anagrams[sort_str] = []
            anagrams[sort_str].append(str)

        return anagrams.values()