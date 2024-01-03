import string
word=input()
lowerAll = len(string.ascii_lowercase)*[-1]
for i in range(len(lowerAll)):
    for j in range(len(word)):
        if string.ascii_lowercase[i] == word[j] and lowerAll[i] == -1:
            lowerAll[i] = j
print(' '.join([str(result) for result in lowerAll]))