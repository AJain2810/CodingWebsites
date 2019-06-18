arr = list()
for i in range(0,6):    
    vals = input().split(' ')
    arr.append([])
    for j in vals:
        arr[i].append(int(j))

min_sum = -9*7
for i in range(0,4):
    for j in range(0,4):
        sum = arr[i][j]+arr[i+1][j+1]+arr[i+2][j+2]+arr[i+2][j]+arr[i+2][j+1]+arr[i][j+1]+ arr[i][j+2]
        #print(sum)
        if sum>min_sum:
            min_sum=sum
print(min_sum)