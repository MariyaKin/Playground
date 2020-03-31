num=int(input())
sum=0
i=0
while(num!=0):
  i=i+1
  if i<=2:
    rem=int(num%10)
    sum=int(sum+rem)
    num=int(num/10)
  else:
    break
print(sum)