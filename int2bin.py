n = int(input())
bin=0
i=0

while n != 0:
    if n%2!=0:
        bin += 10**i
        
    i+=1
    n//=2    

print(bin)
