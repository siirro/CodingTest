class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        #재귀 알고리즘 - 백트래킹
        #1. 번호:알파벳 딕셔너리 작성
        #2. 딕셔너리에 키를 넣어 해당하는 알파벳을 하나 뽑는다. 동시에 뽑은 알파벳을 str에 저장하고 인덱스 1 증가시키면서 재귀 함수를 불러온다. 
        #3. 계속 반복해서 다음 자리의 스트링을 뽑고(인덱스 1 증가시킨것=다음 자리의 스트링), 함수를 호출하며 저장된 스트링 옆(str)에 계속 붙힌다. 
        #4. 재귀 함수의 종료시점 설정: 차곡차곡 쌓인 문자열(str)의 글자수와 digits(인풋)의 자리수가 같으면 정답 배열에 str을 추가하고 함수를 종료한다. 그 후 다시 반복문으로 함수를 호출.
        
        number = {
            '2' : ['a', 'b', 'c'],
            '3' : ['d', 'e', 'f'],
            '4' : ['g', 'h', 'i'],
            '5' : ['j', 'k', 'l'],
            '6' : ['m', 'n', 'o'],
            '7' : ['p', 'q', 'r', 's'],
            '8' : ['t', 'u', 'v'],
            '9' : ['w', 'x', 'y', 'z']
        }
        
        answer = []
        
        def recursive(index, str=""):
            if len(digits) == len(str):
                answer.append(str)
                return
            for i in number[digits[index]]:
                recursive(index+1, str+i)
        
        if digits:
            recursive(0)
        
        return answer