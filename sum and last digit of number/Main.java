num=int(input())
sum=0
while(num!=0):
  rem=num%10
  sum=sum+rem
  num=num//10
print(sum)
rem2=sum%10
print(rem2)