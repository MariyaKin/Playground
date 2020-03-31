import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		 Scanner sc=new Scanner(System.in);
      String s1,s2;
      s1=sc.nextLine();
       s2=sc.nextLine();
       int var1 = s1.compareTo( s2 );
      if(var1==0)
      {
      System.out.println("Strings are same");
	}
      else
      {
         System.out.println("Strings are not same");
      }
}
}