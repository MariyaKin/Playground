#include <stdio.h>
#include <string.h>
#define MAX_SIZE 100 // Maximum string size

int main()
{
    char str[MAX_SIZE];
    int i, len;
    int freq[26];

    /* Input string from user */
   // printf("Enter any string: ");
    gets(str);

    len = strlen(str);

    /* Initialize frequency of each character to 0 */
    for(i=0; i<26; i++)
    {
        freq[i] = 0;
    }
    for(i=0; i<len; i++)
    {
        if(str[i]>='a' && str[i]<='z')
        {
            freq[str[i] - 97]++;
        }
        else if(str[i]>='A' && str[i]<='Z')
        {
            freq[str[i] - 65]++;
        }
    }
    for(i=0; i<26; i++)
    {
       
        if(freq[i] != 0)
        {
            printf("%c%d", (i + 97), freq[i]);
           printf(" ");
        }
    }

    return 0;
}
