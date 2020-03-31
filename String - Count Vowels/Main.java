import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
      String s1=sc.nextLine();
      int length=s1.length();
      
      int count=0;
      for(int i=0;i<=length-1;i++)
      {
        char ch=s1.charAt(i);
      if((ch=='a') ||(ch=='A' )||(ch=='e' )||(ch=='E' )||(ch=='i') || (ch=='I') || (ch=='o') ||(ch=='O') ||(ch=='u') ||(ch=='U' ))
      {
        count++;
	}
}
      System.out.println(count);
    }
}