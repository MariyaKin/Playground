import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       int l1=sc.nextInt();
       int l2=sc.nextInt();
       int l3=sc.nextInt();
      if(l1<l2)
      {
        if(l1<l3)
        {
          System.out.println("L1");
        }
        else
        {
          System.out.println("L3");
        }
      }
      else
      {
         System.out.println("L2");
        }
      
    }
}