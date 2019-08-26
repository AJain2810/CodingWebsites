test = int(input())
for _ in range(test):
    n = int(input())
    arr = list(map(int, input().split(' ')))
    res = list()
    count = 0
    i=0
    while i < (len(arr)-1):
        start = 0
        end = 0
        while i<(n-1) and arr[i] >= arr[i+1] :
            i += 1
        if i==n-1:
            break
        start = i 
        i +=1

        while i<n and arr[i] >= arr[i - 1]:
            i += 1
        end = i - 1
        res.append((start,end))
        count +=1
    
    if count ==0:
        print("No Profit")
    else:
        print(" ".join(list(map(str,res))))

