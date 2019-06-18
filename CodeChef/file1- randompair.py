test=int(input())
out=list()
for i in range(test):
    size=int(input())
    a=list()
    for j in range(size):
        a.append(int(input()))
    # a=input().strip('' )
    b=set(a)
    if len(b) !=1:
        max1=a.count(max(a))
        a.remove(max(a))
        max2=a.count(max(a))
        possible=(size*(size-1))*2
        count=max1*max2
        out.append(count)

    
    else:
        out.append(size)

for i in range(test):
    print(out[i])
    

""" print(a)
    b=set(a)
    b=list(b)
    possible=(size*(size-1))*2
    size2=len(b)
    c=list()
    b=sorted(b)
    for k in range(size2):
        c.append(a.count(b[i]))

    count=0
    if size2==1:
        count=size
    else:
        count=c[size2]*c[size2-1]

    print(count/possible)
    """