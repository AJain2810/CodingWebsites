def driver_code(stair, optim):
    if stair in optim.keys():
        return optim[stair]
    if stair == 1:
        optim[stair]=1
        return 1
    elif stair == 2:
        optim[stair]=2
        return 2
    elif stair==3:
        optim[stair]=4
        return 4
    else:
        temp = driver_code(stair-1, optim) + driver_code(stair-2, optim) + driver_code(stair-3, optim)
        optim[stair] = temp
        return temp
    

inpt = int(input())
optim = dict()
print(driver_code(inpt, optim))