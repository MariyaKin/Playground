import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
       int n2=s.nextInt();
      if(n2<n1)
      {
    n1=100-n1;
        int a=n1+n2;
         System.out.println(a);
      }
     
      else
       System.out.println(n2-n1);  
      
    }
}