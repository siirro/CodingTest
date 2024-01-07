class MyStack:

    def __init__(self):
        # 덱을 사용해 스택을 모방할 틀 만들기
        self.q = collections.deque()

    def push(self, x: int) -> None:
        # 하나씩 넣어주는데, 스택을 모방하기 위해 맨앞의 값을 덱의 길이만큼 계속 제일 뒤로 빼주는 과정을 반복한다.
        self.q.append(x)
        
        for _ in range(len(self.q) - 1):
            tmp = self.q.popleft()
            self.q.append(tmp)
        
    def pop(self) -> int:
        return self.q.popleft()

    def top(self) -> int:
        return self.q[0]

    def empty(self) -> bool:
        return len(self.q) == 0


# Your MyStack object will be instantiated and called as such:
# obj = MyStack()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.top()
# param_4 = obj.empty()