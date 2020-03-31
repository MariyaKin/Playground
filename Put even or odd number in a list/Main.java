n=int(input())
list1=[0]*n
list2=[]
list3=[]
for i in range(0,n):
  list1[i]=int(input()) 
for i in list1:
  if i % 2==0:
    list2.append(i)
  else:
    list3.append(i)
print(list2)
print(list3)