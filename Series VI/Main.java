import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		int i,n;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
          float s2;
      float s3;
     
      for(i=1;i<=n;i++)
      {
      if(i%2==1)
        
      {
     s2= i*i;
          s3=s2-1;
          System.out.printf("%.0f",s3);
      }
        else if(i%2==0)
        {
        s2= i*i;
         s3=s2-2;
          System.out.printf(" %.0f ",s3);
        }
      }
	}
}