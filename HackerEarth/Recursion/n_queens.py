def isSafe(board, row, col): 
  
    # Check this row on left side 
    for i in range(col): 
        if board[row][i] == 1: 
            return False
  
    # Check upper diagonal on left side 
    for i, j in zip(range(row, -1, -1), range(col, -1, -1)): 
        if board[i][j] == 1: 
            return False
  
    # Check lower diagonal on left side 
    for i, j in zip(range(row, N, 1), range(col, -1, -1)): 
        if board[i][j] == 1: 
            return False
  
    return True

def driver_code(col, board):
#for current row
#check for all columns to find a match
#suitabel folumn found, traverse sub columns
    if col >= len(board):
        return True
    for i in range(len(board)):
        if isSafe(board, i, col): 
            board[i][col]=1
            if driver_code(col+1, board)== True:
                print('YES')
                return True
            
            #No solution found, backtrack
            board[i][col]=0
    return False

size=int(input('Size of the puzzle board\n'))
board = [[0] * size] * size
driver_code(0, board)
print(board)