import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int f=6,s1=5;
      System.out.printf("%d",f);
      for(int i=1;i<n;i++)
      {
        int f2=f+s1;
        System.out.printf(" %d",f2);
        f=f2;
        s1=s1+5;
      }
        
        
        
      
	}
}