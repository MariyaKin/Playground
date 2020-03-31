n=int(input())
list1=[0]*n
sum1=0
for i in range(0,n):
  list1[i]=int(input())
  sum1=sum1+list1[i]
mean1=float(sum1/n)
print(round(mean1,2))