def triplets(a, b, c):
    a = list(sorted(set(a)))
    b = list(sorted(set(b)))
    c = list(sorted(set(c)))
    
    ai = 0
    bi = 0
    ci = 0
    
    ans = 0
    
    while bi < len(b):
        print(bi)
        while ai < len(a) and a[ai] <= b[bi]:
            print(a[ai], b[bi])
            ai += 1
        
        while ci < len(c) and c[ci] <= b[bi]:
            print(b[bi], c[ci])
            ci += 1
        print([ci, ai, bi, [b[bi]], 'f'])
        ans += ai * ci
        bi += 1
    print(ans)
    return ans

arra = list(map(int, input().rstrip().split()))

arrb = list(map(int, input().rstrip().split()))

arrc = list(map(int, input().rstrip().split()))

ans = triplets(arra, arrb, arrc)