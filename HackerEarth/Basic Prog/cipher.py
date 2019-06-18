message=input()
key=int(input())
res=''
for i in message:
    if i >='A' and i<='Z':
        temp=ord(i)
        final = 65 + (temp-65+key)%26
        res = res+ chr(final)
    elif i>='a' and i<='z':
        temp=ord(i)
        final = 97 + (temp-97+key)%26
        res = res+ chr(final)
    elif i>='0' and i<='9':
        temp=ord(i)
        final = 48 + (temp-48+key)%10
        res = res+ chr(final)
    else:
        res=res+i
print(res)