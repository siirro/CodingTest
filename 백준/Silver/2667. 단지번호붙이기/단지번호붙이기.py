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

#1. 해당 좌표가 1이면, 우선 한 단지가 존재한다는 뜻으로 count를 1올린다. 
#2. 재귀 함수 호출: 범위 외or값이 0이면 무시하고, 통과되면 방문했다는 표시로 0을 넣는다. 
# 단지내 개수를 세기위해 home을 1씩 추가하고, 좌표를 상하좌우로 변경해 재귀함수를 또 호출한다. 
# 맨 위의 탈출조건인 인덱스가 범위 외 or 값이0이면 함수종료. 해당없음이라면 방문을 뜻하는 0을 넣고 home에 1 추가, 계속 인접한 값 찾기.
# 모든 재귀함수가 종료되면 한 단지의 집의 숫자가 home에 저장되고 방문한 곳은 전부 값이 0이 되어있다.
#3. 함수 호출 후:단지 내 home의 개수를 개수리스트에 저장. 홈은 초기화. 한 단지 마무리 했으니 다른 단지 찾는다.
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


