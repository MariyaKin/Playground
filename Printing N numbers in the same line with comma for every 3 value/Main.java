#include <stdio.h>
int main() {
	int num,place=3;
  scanf("%d",&num);
  for(int i=1;i<=num;i++)
  {
    printf("%d",i);
    if((i%place==0)&&(i!=num))
    {
      printf(",");
    }
  }
	return 0;
}