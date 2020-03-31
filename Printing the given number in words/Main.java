#include<stdio.h>
int main()
{
  int num;
  scanf("%d",&num);
  if(num>5)
  {
    printf("Invalid");
  }
    
  switch(num)
   {
            case 1: 
                printf("One ");
                break;
            case 2: 
                printf("Two ");
                break;
            case 3: 
                printf("Three ");
                break;
            case 4: 
                printf("Four ");
                break;
            case 5: 
                printf("Five ");
                break;
          
           case 0:
     
      
              printf("Invalid");
              break;
      
    }
  return 0;
}