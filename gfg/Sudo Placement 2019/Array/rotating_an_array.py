for _ in range(int(input())):
    size=int(input())
    vals = list(map(int, input().split(' ')))
    k = int(input())
    ans=list()
    for i in range(size):
        ans.append(vals[(k+i)%size])
    print(' '.join(map(str,ans)))


