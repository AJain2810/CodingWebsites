test=int(input())
for _ in range(test):
    size=int(input())
    arr=list(map(int,input().split(' ')))
    count=0
    stats=True
    for i in reversed(range(size)):
        if arr[i]==i+1:
            continue
        else:
            if arr[i-1]==i+1: 
                count+=1
                arr[i-1],arr[i] = arr[i],arr[i-1]
            elif arr[i-2]==i+1:
                count+=2
                arr[i-2] = arr[i-1]
                arr[i-1] = arr[i]
                arr[i]=i
            else:
                stats=False
    if stats:
        print(count)
    else:
        print('Too Chaotic')
