def superDigitSum(num):
    if len(num)<=1:
        return num

    else:
        return superDigitSum(digitsum(num))

def digitsum(x):
    return str(sum([int (i) for i in list(x)]))


def superDigit(n, k):
    num = str(int(n)*k)
    sum = superDigitSum(num)
    return sum

print(superDigit(3546630947312051453014172159647935984478824945973141333062252613718025688716704470547449723886626736,100000))
#print(superDigit(861568688536788,100000))
 