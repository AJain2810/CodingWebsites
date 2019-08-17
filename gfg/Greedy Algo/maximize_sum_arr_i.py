def max_sum(arr):
    arr = sorted(arr)
    prod = 0
    for i in range(len(arr)):
        prod += i*arr[i]
    return prod

arr = list(map(int, input().split(' ')))
print(max_sum(arr))