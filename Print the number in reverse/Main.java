import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
      int n=s.nextInt();
       int n1=s.nextInt();
      while(n>=n1)
      {
        System.out.println(n);
        n--;
      }
      
    }
}