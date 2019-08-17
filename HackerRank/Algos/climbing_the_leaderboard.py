def get_rank(arr, score):
    count = 1
    #arr = list()
    if len(arr) == len(set(arr)):
        return len(arr) - arr.index(score)
    
    for i in range(len(arr)-2, -1, -1):
        if arr[i+1] ==score:
            break
        if arr[i]==arr[i+1]:
            continue
        if arr[i] == score:
            count += 1
            break
        else:
            #print(arr[i])
            count += 1
            #print(arr[i], count)
    print(count, arr, score)
    return count

#print(get_rank([10,10,20,20,30,30,40,40,50,50,60],50))
def climbingLeaderboard(scores, alice):
    score_list = list(scores)
    score_list.sort()
    res = list()
    print(score_list)
    for i in alice:
        score_list.append(i)
        score_list.sort()
        print(score_list)
        temp = get_rank(score_list , i)
        res.append(temp)
    return res

print(climbingLeaderboard([100, 100, 50, 40, 40,20,10],[5,25,50,120]))