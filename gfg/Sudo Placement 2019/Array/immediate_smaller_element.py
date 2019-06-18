#code
for _ in range(int(input())):
    leng = int(input())
    vals = list(map(int, input().split(' ')))
    ans = list()
    vals.append(1001)
    #print(vals)
    for i in range(len(vals)):
        #print(i)
        try:
            if vals[i] > vals[i+1]:
                ans.append(vals[i+1])
            else:
                ans.append(-1)
         #   print(ans, vals[i], vals[i+1])
        except:
            ans.append(-1)
    print(' '.join(map(str,ans)))
            