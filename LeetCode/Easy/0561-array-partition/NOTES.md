# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
짝수 길이의 배열 안 숫자들을 두개씩 모든 경우로 짝지어보는데, 그 짝들의 최소값의 합이 가장 클 때의 합을 구해야 한다.

# Approach
<!-- Describe your approach to solving the problem. -->
생각해보면, 결국 가장 큰 값을 찾는 것이기 때문에 최소값이 가장 큰 경우를 생각하면 된다. 가장 큰 숫자는 최소값이 될 수 없기 때문에 두번째로 큰 숫자, 가장 큰 두 숫자가 한 쌍이 되면 남는 숫자들로 한 쌍을 만들었을때 가장 큰 값은 네번째로 큰 숫자, 이렇게 배열의 짝의 자리의 수만 전부 가져와 합치면 문제가 원하는 값을 구할 수 있다. 

숫자를 정렬해야 하기 때문에 sort() 함수를 쓰고, 배열에 반복문을 돌리고 나머지를 이용해 짝수의 인덱스의 값만 더해주면 된다.

cf) 파이썬의 배열의 짝수값만 간단하게 구하는 방법
return sum(sorted(nums)[::2])
슬라이싱 구문 [::2]는 배열을 2칸식 건너뛰므로 짝수값만을 간단하게 얻을수있다.

# Complexity
- Time complexity: O(n)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        sum = 0
        nums.sort()
        for i, num in enumerate(nums):
            if i%2==0:
                sum += num
        return sum
        
```
