#include<stdio.h>
int sqauare(int num)
{
  return (num*num);
}
int main()
{
 int num;
  int square;
  scanf("%d",&num);
 square= sqauare(num);
  printf("%d",square);
   return 0;
}

