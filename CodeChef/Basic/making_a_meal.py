def char_counter(test_str, freq_dict):
    #freq_dict = dict() 
  
    for i in test_str: 
        if i in freq_dict: 
            freq_dict[i] += 1
        else: 
            freq_dict[i] = 1
    return freq_dict

def normalize_values(freq_dict):
    queries = list('ce')
    for i in queries:
        if i in freq_dict.keys():
            freq_dict[i] = freq_dict[i]//2
    return freq_dict

def check_lower(freq_dict):
    #freq_dict=dict()
    lowest=float('inf')
    test_str = list('codechef')
    for i in test_str:
        if i not in freq_dict.keys():
            lowest = 0
        if i in freq_dict.keys():
            if lowest > freq_dict[i]:
                lowest = freq_dict[i]
    return lowest

test=int(input())
for i in range(test):
    freq_dict = dict()
    cases = int(input())
    for j in range(cases):
        inpt_str = input()
        freq_dict = char_counter(inpt_str, freq_dict)
        #print(freq_dict)
    freq_dict = normalize_values(freq_dict)
    res = check_lower(freq_dict)
    print(res)