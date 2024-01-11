class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        answer = []
                
        def dfs(start, arr):
            answer.append(arr)
            for i in range(start, len(nums)):
                dfs(i+1, arr+[nums[i]])
                
        dfs(0, [])
        return answer