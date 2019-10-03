test = int(input())
for _ in range(test):
    size = int(input())
    arr = list(map(int, input().split(' ')))
    an = 0

    for i in arr:
        an = an | i
    lst = [[0]* size]*ar

    lst[0][0] = 0
    for x in range(m+1)
        lst[0][x] = size+1
    for i in range(n):
        for x in range(m+1):
            lst[i+1][x] = min(lst[i][x&~arr[i]] + 1, lst[i])