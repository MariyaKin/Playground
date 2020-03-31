num=int(input())
list1=[0]*num
list2=[0]*num
for i in range(0,num):
  list1[i]=int(input())
count=1
for i in range(0,num):
  j=1
  if list1[i]!=list1[j]:
    count=count+1
print(count)
      