class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        # 결국 나올 수 있는 최소값 중 가장 큰 값을 가져오면 되므로, 
        # 오름차순 정렬 후 배열의 짝수번호만 가져오면 된다.
        sum = 0
        nums.sort()
        for i, num in enumerate(nums):
            if i%2==0:
                sum += num
        return sum
        