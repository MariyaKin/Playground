import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      String s1;
      s1=sc.nextLine();
      int length=s1.length();
      for(int i=length-1;i>=0;i--)
      {
         System.out.print(s1.charAt(i));
      }
     
      
	}
}