import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int s1;
      int count1=0,count2=0;
      for(int i= 0;i<n;i++)
      {
        s1=s.nextInt();
        if(s1<0)
        {
          count1++;
        }
        else
        {
          count2++;
        }
      }
   System.out.printf("Number of positive numbers is %d and the number of negative numbers is %d",count2,count1);
    }
}