import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      String s1=sc.nextLine();
       String s2=sc.nextLine();
      StringBuffer sbf=new StringBuffer(s2);
      sbf.reverse();
      String s3=sbf.toString();
      if(s1.equals(s3))
      {
        System.out.println("It is same");
      }
      else
      {
         System.out.println("It is not same");

      }
	}
}