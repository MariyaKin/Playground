import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      String s1=sc.nextLine();
      String s2="the";
     s1 = s1.replaceAll(s2, "");
	
      System.out.println(s1.trim());
	}
}