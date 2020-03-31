import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      float f=(float)0.5;
      int s1=1;
      System.out.printf("%.1f",f);
      for(int i=1;i<n;i++)
      {
      float f2=(float)f+s1;
        System.out.printf(" %.1f",f2);
        f=f2;
        s1=s1*3;
      }
        
        
        
      
	}
}