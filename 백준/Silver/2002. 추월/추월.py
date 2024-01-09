import collections

count_car = int(input())
answer = 0
in_car = collections.deque()

for i in range(count_car*2):
	if i < count_car:
		in_car.append(input())
	else:
		out_car = input()
		if out_car == in_car[0]:
			in_car.popleft()
		else:
			in_car.remove(out_car)
			answer += 1

print(answer)