class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        answer = []
                
        def dfs(start, list):
            answer.append(list)
            for i in range(start, len(nums)):
                dfs(i+1, list+[nums[i]])
                
        dfs(0, [])
        return answer