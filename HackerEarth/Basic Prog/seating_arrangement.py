test=int(input())
res=''
for i in range(test):
    seat=int(input()) -1
    index= (seat)%12
    type=''
    comp = seat//12
    opp_seat = 12-index
    final_seat = comp*12 + opp_seat
    index = final_seat%12
    if index==0 or index==1 or index==6 or index==7:
        type='WS'
    elif index==2 or index==5 or index==8 or index==11:
        type='MS'
    else:
        type='AS'
    res = res + str(final_seat)+ ' '+ type +'\n'
print(res)
