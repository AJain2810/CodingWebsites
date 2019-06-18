n,m=map(int, input().split(' '))
arr=[0.0]*n
for _ in range(m):
    a, b, k = map(int, input().split(' '))
    a=a-1
    b=b-1
    for i in range(a,b+1):
        arr[i]=arr[i]+k


maxi=float('-inf')
for i in range(n):
    if arr[i]>=maxi:
        maxi=arr[i]
print(int(maxi))