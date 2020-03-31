import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      int x,y,z;
      Scanner sc=new Scanner(System.in);
      x=sc.nextInt();
      y=sc.nextInt();      
      z=sc.nextInt();
      int s=sc.nextInt();
     int  count=0;
      if(s<=x)
      {
       count++;
      }
       if(s<=y)
       {
        count++;
      }
      if(s<=z)
           {
        count++;
      }
      if(s>x||s>y||s>z) 
      {
        count=0;
       
      }
       System.out.println(count);
    }
}