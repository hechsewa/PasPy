def andgate():
    op1 = 1

def andMethod(op1, op2):
    if op1 == 1:
        if op2 == 1:
            result = 1
        else:
            result = 0



    op2 = 0
    andMethod(op1,op2)
    print('Gates result:')
    print(result)


if __name__ == "__main__":
    andgate()