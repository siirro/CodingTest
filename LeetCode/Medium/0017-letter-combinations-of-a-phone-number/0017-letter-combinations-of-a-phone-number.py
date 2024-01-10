class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
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
        
        def recursive(index, str):
            if len(digits) == len(str):
                answer.append(str)
                return
            for i in number[digits[index]]:
                recursive(index+1, str+i)
        
        if digits:
            recursive(0, "")
        
        return answer