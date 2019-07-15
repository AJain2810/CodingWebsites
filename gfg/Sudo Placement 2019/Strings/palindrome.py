test=int(input())
for i in range(test):
    size = int(input())
    origi = input()
    stri = list(origi)
    stri.reverse()
    #print(stri)
    stri = ''.join(stri)
    if stri==origi:
        print('YES')
    else:
        print('NO')
    #print(stri)
    #print(origi)
    