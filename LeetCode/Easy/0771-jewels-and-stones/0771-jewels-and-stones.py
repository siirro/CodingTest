class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        count = 0
        
        # 1. 그냥 반복문으로 풀기
        # for i, jew in enumerate(jewels):
        #     for j, stn in enumerate(stones):
        #         if jew == stn: count += 1

        # 2. 딕셔너리를 이용해 풀기 : 모든 스톤의 개수를 세고, 스톤 키값에 쥬얼리를 하나씩 넣은 밸류값만 더해주면 된다.
        dic_stones = defaultdict(int)
        
        for i, n in enumerate(stones):
            dic_stones[n] += 1 
        
        for i, n in enumerate(jewels):
            count += dic_stones[n]
        
        return count
