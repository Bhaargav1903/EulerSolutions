import math
def sum():
    num = pow(2,1000)
    sum = 0
    while num > 0:
        ld = num%10
        sum = sum + ld
        num = num//10 
    return sum

def main():
    print(int(sum()))
    
if __name__ == '__main__':
    main()
#The Output is 1366 for sum of 2^1000
