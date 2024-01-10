class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
        answer = []
        this_list = []
        
        def go(start, num_range):
            if len(this_list) == k:
                answer.append(this_list[:])
                return
            
            if len(this_list) > k:
                return

            for i in range(start, len(num_range)):
                this_list.append(num_range[i])
                go(i+1, num_range)
                this_list.pop()
        
        num_range = [i for i in range(1, n+1)]
        go(0, num_range)
        
        return answer