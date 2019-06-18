#code
def gcd(x, y):
   while(y):
       x, y = y, x % y

   return x

# define lcm function
def lcm(x, y):

   lcm = (x*y)//gcd(x,y)
   return lcm
   
import math
test=int(input())
for _ in range(test):
    num1, num2 = map(int, input().split(' '))
    print(lcm(num1,num2),gcd(num1,num2))