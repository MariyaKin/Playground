import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
      int s1,s2;
      s1=s.nextInt();
      s2=s.nextInt();
      if(s1==s2)
      {
        System.out.println(+s1+" and "+s2+" are equal");
      }
      else if(s1>s2)
      {
         System.out.println(+s1+" greater than " +s2);
    }
      else
      {
      System.out.println(+s1+" less than "+s2);
      }
    }
}