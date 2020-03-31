#include <stdio.h>
int main() {
	int num;
  int i;
  scanf("%d",&num);
  int sum=0;
  for(i=0;i<=num;i++)
      {
        sum=sum+i;
      }
      printf("%d\n",sum);
	return 0;
}