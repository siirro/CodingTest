class MyQueue:

    def __init__(self):
        # self.q = collections.deque()
        self.q = []
        
    def push(self, x: int) -> None:
        self.q.append(x)

    def pop(self) -> int:
        # return self.q.popleft() # 덱 쓰면 팝레프트로 바로 해결할수있음
    
        val = self.q[0]
        self.q = self.q[1:]
        return val

    def peek(self) -> int:
        return self.q[0]

    def empty(self) -> bool:
        return len(self.q) == 0


# Your MyQueue object will be instantiated and called as such:
# obj = MyQueue()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.peek()
# param_4 = obj.empty()