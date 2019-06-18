size=int(input())
arr=list(map(int, input.split(' ')))
incorrect_list=list()
for i in range(size):
    if i+1 == arr[i]:
        continue
    else:
        if arr[i] not in incorrect_list:
            incorrect_list.append(arr[i])
print(len(incorrect_list)-1)
    