#include<stdio.h>
	static int mostFrequent(int arr[], int num, int freq[]) 
	{ 
	    int max_count_idx = 0; 
		int curr_count = 1; 
		
	    for(int i = 0; i < num; i++)
	    {
		    for (int j = i+1; j < num; j++) 
		    { 
	            if(arr[i] == arr[j])
	            curr_count ++;
		    }
		    freq[i] = curr_count;
		    curr_count = 1;
	    } 
	    for( int i = 0; i < num; i++)
	    {
            if(freq[i]>freq[max_count_idx])
            max_count_idx = i;
	    }
	    return arr[max_count_idx];
	}
    int main()
    {
        int num;
        scanf("%d",&num);
        int arr[10];
        for(int i = 0; i < num; i++)
        {
            scanf("%d",&arr[i]);
        }
        int freq[num];
		printf("%d",mostFrequent(arr,num,freq)); 
		return 0;
	}