from sys import stdin

N = int(stdin.readline())
grid = [list(map(int, stdin.readline().rstrip())) for _ in range(N)]
count = 0
home = 0

def dfs(i, j):
    if i<0 or j<0 or i>=N or j>=N or grid[i][j] != 1:
        return
    grid[i][j] = 0
    global home
    home += 1
    dfs(i + 1, j)
    dfs(i - 1, j)
    dfs(i, j + 1)
    dfs(i, j - 1)

homes = []
for i in range(N):
    for j in range(N):
        if grid[i][j] == 1:
            count += 1
            dfs(i, j)
            homes.append(home)
            home = 0


homes.sort()
print(len(homes))
for h in homes:
    print(h)