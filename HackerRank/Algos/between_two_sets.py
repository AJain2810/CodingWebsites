from math import gcd 
#from fractions import gcd # If python version is below 3.5
from functools import reduce # Needed for Python3.x

def lcm(denominators):
    return reduce(lambda a,b: a*b // gcd(a,b), denominators)

def find_gcd(list):
    x = reduce(gcd, list)
    return x

n_a, n_b = map(int,input().split(' '))
arr1 = list(map(int,input().split(' ')))
arr2 = list(map(int,input().split(' ')))

lcm_arr1 = lcm(arr1)
gcd_arr2 = find_gcd(arr2)
res=list()
i=1
while 1>0:
    

    if gcd_arr2%(lcm_arr1*i)==0:
        res.append(lcm_arr1*i)
        

    if (lcm_arr1*i) >= gcd_arr2:
        break
    i+=1
print(len(res))
