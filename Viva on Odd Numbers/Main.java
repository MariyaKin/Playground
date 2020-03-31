import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
     
      int n,count=0;
   float score=0.0f;
      
      do
   {
       n =s.nextInt();
      if (n<0)
          score=(float)(score-1.0);
      else if(n%2==1)
      {
            count++;
            score++;
       }
    else
           score=(float)(score-0.5);
  }while(n>0&&count!=3);
      System.out.printf("%.1f",score);
    }
}