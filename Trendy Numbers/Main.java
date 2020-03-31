import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
        int n=s.nextInt();
      int count=0,rem;
      while(n!=0)
      {
        count++;
        rem=n%10;
        n=n/10;
      }
      if (count==3)
      {
        System.out.println("Trendy Number");
      }
      else if((((n%100)/10)%3)==0)
              {
                 System.out.println("Not a Trendy Number");
              }
    }
              }