i=1
j = 1
sum = 0
while i <= 4000000:
    if i % 2 == 0:
        sum += i
    i, j = j, i+j  
print(sum)