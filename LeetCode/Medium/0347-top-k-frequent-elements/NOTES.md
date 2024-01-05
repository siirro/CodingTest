# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
주어진 배열 중 가장 많이 중복되는 숫자를 k개 까지 반환해야 한다.
빈도 수를 반복문으로 산출하고, 정렬하고, ::k를 사용해 개수만큼만 반환한다.

# Approach
<!-- Describe your approach to solving the problem. -->
1. 빈출 데이터 작성 - defaultdict 이용해 숫자별 딕셔너리 만들어 반복문으로 카운트 세기
 (파이썬의 counters 클래스를 쓰면 이 과정이 단번에 진행된다)
2. 빈출순위 산정 - sorted로 dic의 items 튜플의 1번째 칸을 기준으로 내림차순 정렬하기(key에 x: x[1]이라는 익명 함수를 넣어준다. x는 기준이 리스트의 어떤 요소라는 뜻이고 x[1]은 그중에서도 리스트의 1번 자리에 있는 요소를 선택한다는 뜻이다.)
3. 반복문을 통해 빈출순위 k까지만의 key값을 결과 배열에 추가하여 리턴

# Complexity
- Time complexity: O(NlogN)
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
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
```​
