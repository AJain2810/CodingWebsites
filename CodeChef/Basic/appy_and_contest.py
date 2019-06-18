import math
test=int(input())
for i in range(test):
    n,a,b,k = map(int, input().split(' '))
    count_a = n//a
    count_b = n//b
    a_B_lcm = a*b/math.gcd(a,b)
    count_a_b = n//a_B_lcm
    #print(count_a)
    #print(count_a_b)
    #print(count_b)
    res = count_a + count_b - 2*count_a_b
    if res>=k:
        print('Win')
    else:
        print('Lose')