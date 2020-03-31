n=int(input())
list1=[0]*n
for i in range(0,n):
  list1[i]=int(input())
list1.sort()
print(list1[n-2])