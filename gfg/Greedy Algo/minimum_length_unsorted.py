def min_unsorted_array(arr):
    s= 0
    e = len(arr)-1
    for i in range(len(arr)):
        if arr[i]>arr[i+1]:
            s=i
            break
    for i in range(len(arr)-1,0,-1):
        if arr[i] < arr[i-1]:
            e = i
            break

    max_no = max(arr[s:e])
    min_no = min(arr[s:e+1])

    for i in range(s):
        if arr[i]>min_no:
            s=i
            break
    for i in range(len(arr)-1,e,-1):
        if arr[i]<max_no:
            e=i
            break
    print(s,e)

arr = list(map(int, input().split(' ')))
min_unsorted_array(arr)
