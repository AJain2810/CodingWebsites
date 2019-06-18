test=int(input())
for i in range(1,test+1):
    order = int(input())
    res=list()
    print(i)
    lower_limit = 5*order
    print(lower_limit)
    upper_limit = 5*(order+1)
    print(upper_limit)
    count = upper_limit - lower_limit
    for j in range(lower_limit,upper_limit):
        res.append(j)
    print(count)
    print(' '.join(map(str,res)))