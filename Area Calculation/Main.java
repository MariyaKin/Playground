import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
           // float pi=3.14;
      Scanner s=new Scanner(System.in);
      int a,l,b,a1,a2;
      float r;
      double  a3;
      a=s.nextInt();
       l=s.nextInt();
       b=s.nextInt();
       r=s.nextFloat();
      a1=a*a;
      a2=l*b;
      a3=(3.14)*(r*r);
      System.out.println(""+a1);
     System.out.println(""+a2);
     System.out.printf("%.3f",a3);
      
      
    }
}