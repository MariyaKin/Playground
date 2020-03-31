import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      int i,n;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      float a=1;
     float b=2;
  System.out.printf("%.0f %.1f ",a, b);
    for(i=3;i<=n;i++)
    {
        if(i%2==1)
        {
            a=a*3;
       System.out.printf("%.1f ",a);
        }
        else
        {
            b=b*3;
             System.out.printf("%.1f ",b);
        }
    }
      
    }
}
      
      
		
    