#include<stdio.h>
int sq(int a)
    {
      int s=(a*(a+1))/2;
      return s;
}
int main() {
    int n,ss;
  scanf("%d",&n);
      ss=sq(n);
  printf("%d",ss);

  	return 0;
}