import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      int num=sc.nextInt(); 
      System.out.println(num);
      int count=0;
     while(num!=1){

                if (num%2==0)
                {
// System.out.println(num);
                num /= 2;
count++;
                }
            else
{

num = (num*3)+ 1;
count++;
       
           
            }
       System.out.println(num); 
     }
 
     System.out.println(count);
    }
}