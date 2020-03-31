#include <stdio.h>
int main() {
	int num;
  int i,j;
  scanf("%d",&num);
 for(j=1,i=1;j<=num;i=i+2,j++)
  {
   
    if(i%2 !=0 )
    {
      printf("%d\n",i);
    }
    
   // printf("\n");
  }
	return 0;
}