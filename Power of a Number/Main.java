import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int base,exp;
      base=sc.nextInt();
       exp=sc.nextInt();
      System.out.println(Math.pow(base,exp));
      
    }
}