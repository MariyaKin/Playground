#include <stdio.h>
int main(){
	int rows=5, cols=5, i, j;
  int n;
  scanf("%d",&n);

    

    for(i=1; i<=n; i++)
    {
        for(j=1; j<=n; j++)
        {
            // Print the current row number
            printf("%d", i);
        }

        printf("\n");
    }
  	return 0;
}

