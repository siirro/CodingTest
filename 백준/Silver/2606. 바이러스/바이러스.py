com_count = int(input())
connected_pair = int(input())
pairs = [list(map(int, input().split())) for _ in range(connected_pair)]
graph = [[] for _ in range(com_count + 1)]

for pair in pairs:
    graph[pair[0]].append(pair[1])
    graph[pair[1]].append(pair[0])

visited = [False] * (com_count + 1)

def dfs(index):
    visited[index] = True
    for i in graph[index]:
        if not visited[i]:
            dfs(i)

dfs(1)

print(sum(visited)-1)