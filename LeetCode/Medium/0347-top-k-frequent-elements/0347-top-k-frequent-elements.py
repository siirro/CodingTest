class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        dic = collections.defaultdict(int)
        
        for num in nums:
            dic[num] += 1
            
        sorted_dic = sorted(dic.items(), key=lambda x:x[1], reverse=True)
        
        print(sorted_dic)
        
        result = []
        for num, count in sorted_dic[:k]:
            result.append(num)
            
        return result