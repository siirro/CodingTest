import heapq

n, m = map(int, input().split())
card = list(map(int, input().split()))

heapq.heapify(card)

for _ in range(m):
    first = heapq.heappop(card)
    second = heapq.heappop(card)
    heapq.heappush(card, first+second)
    heapq.heappush(card, first+second)

print(sum(card))