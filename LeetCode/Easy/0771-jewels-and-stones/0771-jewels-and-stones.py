class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        count = 0
        for i, jew in enumerate(jewels):
            for j, stn in enumerate(stones):
                if jew == stn: count += 1

        return count
