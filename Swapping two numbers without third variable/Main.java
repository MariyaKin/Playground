import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
         int s1,s2,temp=0;
      Scanner sc=new Scanner(System.in);
      s1=sc.nextInt();
      s2=sc.nextInt();
     s1=s1+s2;
      s2=s1-s2;
      s1=s1-s2;
      
    System.out.println(""+s1);
       System.out.println(""+s2);
      
      
    }
}