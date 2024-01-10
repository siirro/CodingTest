class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        #DFS 탐색 : 재귀 알고리즘
        #빈 배열 세개를 만든다. 
        #1. 출력용 정답모음 배열 answer
        #2. 해당 경우의 수를 완성시킬 배열 this_str
        #3. 경우의 수에 넣을 숫자로 어떤게 남았는지 담는 배열 remain
        #인풋을 복사해 remain으로 명명하고, 하나씩 this_str에 담고 동시에 remain에서 빼준다. 그와 동시에 바로 동일한 함수를 호출해 remain의 길이가 0이 되게 한다. this_str을 복사해 answer에 넣고, 코드로 남아있는 만큼 pop시키고 그 전의 반복문에 남아있던 i를 이용해 또 재귀함수를 반복한다. 
        
        answer = []
        this_str = []
        
        def go(arr):
            if len(arr) == 0:
                answer.append(this_str[:])
            for i in arr:
                remain = arr[:]
                this_str.append(i)
                remain.remove(i)
                go(remain)
                this_str.pop()
        
        go(nums)
        
        return answer
            
        