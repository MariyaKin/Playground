#include <stdio.h>
int main() {
  int size,i,j;\
    scanf("%d",&size);
	for(i=0; i < size ;i++)
    {
        //4
        for(j=0; j < size ;j++)
        {
            //5
            if(i==j || j==(size-i-1))
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        //6
        printf("\n");
    }
	return 0;
}
