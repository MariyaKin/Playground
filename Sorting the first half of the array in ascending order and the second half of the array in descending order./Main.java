	#include<stdio.h>
#include<stdlib.h>
int main()
{
	int n,i,j,temp;

	scanf("%d",&n);
    int a[n];
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}

	 for(int i=0;i<n/2;i++)
  {
    for(int j=i+1;j<n/2;j++)
    {
      if(a[i]>a[j])
    {
        temp=a[i];
      a[i]=a[j];
      a[j]=temp;
    }
    }
  }
  for(int i=n/2;i<n-1;i++)
  {
		for(j=n/2;j<n-1;j++)
		{
			if(a[j]<a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	for(i=0;i<n;i++)
	{
		printf("%d ",a[i]);
	}
	return 0;
				
}