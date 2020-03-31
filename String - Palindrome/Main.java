import java.io.*;
import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{
		 Scanner sc=new Scanner(System.in);
     
      String s1,s2,s3;
     s1=sc.nextLine();
      StringBuffer sbf = new StringBuffer(s1); 
      sbf.reverse();
      String s5=sbf.toString();
      if(s1.equals(s5))
         {
      
      System.out.println("Palindrome");
         }
      else
      {
          System.out.println("Not a Palindrome");
      }
      
    }
}