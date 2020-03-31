n=int(input())
list1=[0]*n
list2=[0]*n
for i in range(0,n):
  list1[i]=int(input())
for i in range(0,n):
  list2[i]=int(input())
count=0
for j in range(0,n):
    if(list1[j]>=list2[j]):
        count=count+1
if(count==n):
    print("Compatible")
else:
    print("not")