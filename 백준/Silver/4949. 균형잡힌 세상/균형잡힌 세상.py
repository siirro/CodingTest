while(True):
    string = input()
    stack = []
    temp = True
    
    if(string == '.'):#종료조건 만족시
        break
    
    for i in string:
        if(i == '[' or i == '('):
            stack.append(i)
        elif(i == ')'):
            if not stack or stack[-1] == '[':
                temp = False
                break
            elif stack[-1] == '(':
                stack.pop()
        elif(i == ']'):
            if not stack or stack[-1] == '(':
                temp = False
                break
            elif stack[-1] == '[':
                stack.pop()
    if temp == True and not stack:
        print("yes")
    else:
        print("no")