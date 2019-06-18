def driver_code(arr, stri, start, stop):
    if start<=stop:
        mid = (start+stop)//2
        arr.append(stri[mid])
        driver_code(arr, stri, start, mid-1)
        driver_code(arr, stri, mid+1, stop)
    

test=int(input())
for _ in range(test):
    size=int(input())
    arr=list()
    stri = list(input())
    print(stri)
    driver_code(arr, stri, 0 , size-1)
    print(''.join(arr))
