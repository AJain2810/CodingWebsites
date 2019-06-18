def is_vowel(chr_input):
    if chr_input in ['a','e','i','o','u']:
        return True
    elif chr_input in ['A','E','I','O','U']:
        return True
    return False
    
def substr_sum(arr):
    length = len(arr)
    final=0
    for i in range(length+1):
        for j in range(length-i+1):
            final= final + sum(arr[j:j+i])
            print(final)
            print(arr[j:j+i])
    return final   
    
    
test=int(input())
res=list()
for i in range(test):
    input_string = input()
    val=len(input_string)*[0]
    
    for j in range(len(input_string)):
        if is_vowel(input_string[j]):
            val[j]=1
    ans = substr_sum(val)
    res.append(ans)
print('\n'.join(map(str,res)))