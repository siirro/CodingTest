# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
1. 브루트 포스 방법. O(n³)가 나오기 때문에 시간초과로 오답처리행
2. 투 포인터로 합 계산. 값을 정렬하고, 하나의 기준점과 움직이는 두개의 포인트(left, right)로 수의 변화를 찾는다.

# Approach
<!-- Describe your approach to solving the problem. -->
1. 배열 오름차순 정렬 
2. i로 반복문을 시작하고 left와 right를 설정해 하나씩 움직여 합이 0이 될 때를 찾는다. 
3. 합이 0보다 작으면 left를 하나 오른쪽으로 옮겨 합이 커지게 하고, 0보다 크면 right를 왼쪽으로 움직여 값이 작아지게 한다. 합이 0이 되면 정답 배열에 해당 인덱스 정보로 값을 넣고 다음 left로 진행되게 한다. 
4. 배열 안 중복값이 있을 경우를 대비하여 i번의 인덱스의 값과 i의 앞의 값이 같으면 컨티뉴를 걸어 해당 인덱스의 for라운드는 넘어가게 만든다. 

# Complexity
- Time complexity: O(n²)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        result = []
        nums.sort()

        for i, n in enumerate(nums):
            if i > 0 and n == nums[i-1]:
                continue

            left = i + 1
            right = len(nums) - 1

            while left < right:
                threeSum = n + nums[left] + nums[right]
                if threeSum < 0:
                    left += 1
                elif threeSum > 0:
                    right -= 1
                else:
                    result.append([n, nums[left], nums[right]])
                    left += 1
                    while left<right and nums[left] == nums[left-1]:
                        left += 1

        return result
```​
