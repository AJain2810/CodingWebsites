import math
def mean(lst):
    sum_elements = sum(lst)
    size_lst = len(lst)
    mean = round(sum_elements/size_lst,1)
    return mean

def squared_distannce(num, mean):
    sq_list = [0]*len(num)
    for i in range(len(num)):
        sq_list[i] = (num[i]-mean)**2
    return sum(sq_list)

def std_compute(squared_list_sum, size):
    compute1 = squared_list_sum/size
    compute2 = round(math.sqrt(compute1),1)
    return compute2

num_elements = int(input())
num = [int(x) for x in input().split(' ')]
num_mean = mean(num)
sq_dst = squared_distannce(num, num_mean)
std = std_compute(sq_dst, num_elements)
print(std)