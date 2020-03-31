size=int(input())
list1=[0]*size
output_list=[]
for i in range(size):
  list1[i]=int(input())
number_rot=int(input())
for i in range(size-number_rot,size):
    output_list.append(list1[i])   
for i in range(0,size-number_rot):
    output_list.append(list1[i])  
print(output_list)