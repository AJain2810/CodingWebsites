def FreqDict(my_list): 
  
    # Creating an empty dictionary  
    freq = {} 
    for item in my_list: 
        if (item in freq): 
            freq[item] += 1
        else: 
            freq[item] = 1
    return freq

n=int(input())
arr_dic=FreqDict(sorted(list(map(int, input().split(' ')))))
max_count=0
for i in arr_dic.keys():

    count2=0
    count1 = arr_dic[i]
    if (i+1) in arr_dic:
        count2= arr_dic[i+1] + arr_dic[i]
    max_count = max(max_count, count2, count1)

print(max_count)


