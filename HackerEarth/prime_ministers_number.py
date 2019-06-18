def isPrime2(n):
    if n==2 or n==3: return True
    if n%2==0 or n<2: return False
    for i in range(3,int(n**0.5)+1,2):   # only odd numbers
        if n%i==0:
            return False    

    return True

res=list()
num1, num2 = map(int, input().split(' '))
for i in range(num1, num2+1):
    if isPrime2(i) and isPrime2(sum(map(int,list(str(i))))):
        res.append(i)
print(' '.join(map(str,res)))

