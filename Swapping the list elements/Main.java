n=int(input())
list1=[0]*n
for i in range(n):
    count_fruit=int(input())
    list1[i]=count_fruit
temp=list1[0]
list1[0]=list1[n-1]
list1[n-1]=temp
print(list1)