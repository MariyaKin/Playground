import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int fact=1,c=0;
     
    
        for(int i=2;i<=n/2;i++)
        {
          fact*=i;
         if(fact==n)
         {
       c=1;
      }
        }
      if(c==1)
      {
        System.out.println("Yes");
         }
         else
      {
        System.out.println("No");
         }
                           
    }
}