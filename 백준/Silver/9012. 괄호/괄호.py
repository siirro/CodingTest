T = int(input())

for _ in range(T):
    str = input()
    stack = []

    for char in str:
        if char == '(':
            stack.append(char)
        elif char == ')':
            if not stack:
                stack.append(char)
                break
            else:
                stack.pop()

    if len(stack) == 0:
        print('YES')
    else:
        print('NO')