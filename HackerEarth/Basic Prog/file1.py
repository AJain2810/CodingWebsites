def isPrime2(n):
    if n==2 or n==3: return True
    if n%2==0 or n<2: return False
    for i in range(3,int(n**0.5)+1,2):   # only odd numbers
        if n%i==0:
            return False    

    return True
    
num = int(input())
#print(num)
res=list()
for i in range(2,num):
    if is_prime(i):
        res.append(i)
print(res)
print(' '.join(map(str,res)))
    
