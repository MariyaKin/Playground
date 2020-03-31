#include <stdio.h>
#include <string.h> 
int main()
{
   char s1[100];
   int i = 0,j = 0, count[26] = { 0 };
   scanf("%[^\n]s",s1);
   while (s1[i] != '\0') 
   {
      if (s1[i] >= 'a' && s1[i] <= 'z')
      {
          j= s1[i] - 'a';
         count[j]++;
      }
         i++;
   }
     for(i=0;i<26;i++)
     {
         if(count[i] == 0)
         {
             printf("%c ", i + 'a', count[i]);
             count[i]=0;
         }
     }
   return 0;
}