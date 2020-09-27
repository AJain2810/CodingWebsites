#!/bin/python3
# Problem URL: https://www.hackerrank.com/challenges/dynamic-array/problem
#
# Complete the 'dynamicArray' function below.
#
# The function is expected to return an INTEGER_ARRAY.
# The function accepts following parameters:
#  1. INTEGER n
#  2. 2D_INTEGER_ARRAY queries
#

def dynamicArray(n, queries):
    l = [[] for _ in range(n)]
    last_answer = 0
    res = list()
    for query in queries:
        query_type = query[0]
        query_index = query[1]
        query_y = query[2]

        if query_type == 1:
            seq = ( query_index ^ last_answer ) % n
            l[seq].append(query_y)
        elif query_type == 2:
            seq = ( query_index ^ last_answer ) % n
            last_answer = l[seq][query_y % len(l[seq])]
            res.append(last_answer)
    
    return res


    # Write your code here
