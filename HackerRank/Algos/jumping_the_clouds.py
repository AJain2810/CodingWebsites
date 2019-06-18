def jumpingOnClouds(c):
    currstate=0
    final_state = len(c)-1
    ssum=0
    print(final_state)
    while(currstate<final_state):
        if len(c)<currstate+3:
            currstate+=1
            ssum+=1
            break
        if c[currstate+2]==1:
            currstate+=1
            ssum+=1
        else:
            currstate+=2
            ssum+=1
    return ssum

arr_inpy = list(map(int, input().split(' ')))
print(jumpingOnClouds(arr_inpy))