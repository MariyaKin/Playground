#include <stdio.h>
int main() {
	int num;
  int i;
  scanf("%d",&num);
  for(i=0;i<=num;i++)
  {
    if(i%2 !=0 )
    {
      printf("%d\n",i);
    }
   // printf("\n");
  }
	return 0;
}