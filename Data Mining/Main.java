import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
          int n=s.nextInt();
      int s1=0,s2=0;
      int temp=n;
      while(n!=0)
      {
        int n1=n%10;
        if(n1%2==0)
        {
       s1+=n1;         
        }
        else
        {
           s2+=n1;
        }
        n=n/10;
    }
      int s3=s1+s2;
      if(s3==temp)
      {
        System.out.println("yes");
      }
      else
       {
        System.out.println("No");
      }
      }
}