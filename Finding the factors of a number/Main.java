#include <stdio.h>
int main() {
	int num;
  int fact;
  scanf("%d",&num);
  for(fact=1;fact<=num;fact++)
  {
    if(num%fact==0)
    {
      printf("%d\n",fact);
    }
  }
	return 0;
}