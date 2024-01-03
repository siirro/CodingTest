# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->
주어진 아나그램들을 배열로 그룹화하는 문제이다.
 
# Approach
<!-- Describe your approach to solving the problem. -->
하나씩 sorted와 join을 사용해 정렬해보며 아나그램별로 key값을 만들고, 같은 그룹 여부와 이미 생성된 그룹 여부를 판단한다. 아나그램 그룹이 확인되면 해당 key의 value로 넣어준다.



# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->
O(n)
- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
```
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # 비어있는 리스트 생성
        anagrams = {} 

        for str in strs:
            sort_str = ''.join(sorted(str))
            if sort_str not in anagrams: 
                anagrams[sort_str] = []
            anagrams[sort_str].append(str)
        return list(anagrams.values())
```

# ETC
리스트의 초기화는 이처럼 손수 초기화를 해도 되지만, collections의 defaultdict 메서드를 이용하면 코드의 길이가 줄어드는 등의 편의성이 있으므로 후자의 사용을 권장한다.

# Memo
파이썬으로 코딩테스트도 처음이고 파이썬 사용도 거의 처음이라고 보면 된다. 아나그램이란 말도 처음 들어보고 이 릿코드? 라는 사이트도 처음 가입했다. 이 자체 포스트 블로그 기능이 상당히 맘에 든다. 고로 열심히 작성중.
아무튼 전부 처음인데 대뜸 이 문제를 풀어보게 되어서 한 한시간동안 (...?) 상태로 구글링만 한것 같다. 결국 정답코드 몇개 전부 복사해오고 파이썬 디버깅으로 한줄씩 돌려보다가 간신히 이해했다. 문제의 의도를 첫방에 캐치하지 못한게 내가 제일 헤멘 이유이다. 왜 갑자기 뜬금없이 출력이 배열하나, 배열두개, 배열세개로 되나 했는데, 제공된 str속 아이들의 제각각인 스펠링을 그룹화한 결과였다. 같은스펠링의 아나그램 하나, 다른스펠링의 아나그램 두개, 또다른 스펠링의 아나그램 세개였네..... 문제가 영어라서 제대로 읽지 못한 것도 원인 중 하나라 생각한다. 이 사이트를 애용하여 많은 영어 문제를 직접 해석해보면서 익숙해져야겠다. 아무튼 문제를 이해하니 풀이과정 또한 순조롭게 이해되었고, 혼자 풀어볼 수 있게되었다. 알고보니 매우 쉬운 문제!


​
