class Solution:
    def longestPalindrome(self, s: str) -> str:
        
        # 1. 포문으로 i부터 돌린다.
        # 2. 앞뒤가 같은 인덱스를 찾는다.
        # 3. 찾은 부분을 왼쪽오른쪽 확장시킨다.
        # 4. 배열의 길이가 1일때 혹은 배열의 값이 전부 동일할때는 예외처리를 미리 걸어놓아 시간을 조금이라도 줄인다.
        
        def expand(left, right):
            while right < len(s) and left >= 0 and s[left] == s[right]:
                left -= 1
                right += 1
            return s[left+1:right]
        
        if len(s) < 1 or s == s[::-1]:
            return s
        
        result = ''
        for i, n in enumerate(s):
            result = max(result, expand(i, i+2), expand(i, i+1), key=len)
            
        return result