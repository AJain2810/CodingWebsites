test=int(input())
for _ in range(test):
    chars='01'
    stats=True
    if any((c not in chars) for c in stri):
        stats=False
    #res='1' if stats==True else '0'
    print('1' if stats==True else '0')
    