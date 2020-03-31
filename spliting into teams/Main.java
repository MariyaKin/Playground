import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
  int s=sc.nextInt();
   int s1=sc.nextInt();
  int s3=s/s1;
  int s4=s%s1;
  System.out.println("The number of students in each team is "+s3+" and left out is "+s4);
  
}
}