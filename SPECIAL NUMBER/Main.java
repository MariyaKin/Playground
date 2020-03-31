import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int m=s.nextInt();
     do
     {
       if (n < 10 || n > 99)  
       {
         System.out.println("Invalid");
       }
     else
    {  
        int first = n / 10; 
        int last = n % 10;  
        int sum = first + last;  
        int pro = first * last;   
        if ((sum + pro) == n) 
        { 
           System.out.println(n);
        } 
       n++;
     }
}while(n<=m);
    }
    }