import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int m=s.nextInt();
      int mul=0;
      for(int i=1;i<=m;i++)
      {
        mul=n*i;
        System.out.println(+i+"*"+n+"="+mul);
      }
      
    }
}