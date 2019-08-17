#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the superDigit function below.
def superDigit(n, k):
    num = int(n*k)
    sum = superDigitSum(num)
    return sum

def superDigitSum(num):
    if num<10:
        return num

    else:
        temp=num
        num_sum=0
        while temp>0:
            num_sum += temp%10
            temp = temp//10
    return superDigitSum(num_sum)


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nk = input().split()

    n = nk[0]

    k = int(nk[1])

    result = superDigit(n, k)

    fptr.write(str(result) + '\n')

    fptr.close()
