def encode(s,l,r,a):
    if l<=r:
        mid=(l+r)/2
        a.append(s[mid])
        encode(s,l,mid-1,a)
        encode(s,mid+1,r,a)
for _ in range(int(raw_input())):
    n=int(raw_input())
    s=raw_input()
    a=[]
    encode(s,0,n-1,a)
    print ''.join(a)