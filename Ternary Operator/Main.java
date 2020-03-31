import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
     String strInput = (n % 2 == 0) ? "Even" : "Odd";   
      System.out.println(strInput);
    }
}