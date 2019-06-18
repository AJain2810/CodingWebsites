size,k = map(int,input().split(' '))
vals = list(map(int, input().split(' ')))

ans=list()
for i in range(size):
    ans.append(vals[(k+i)%size])
print(' '.join(map(str,ans)))


