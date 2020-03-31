import java.util.*;

public class Main
{
  public static void main(String[]args)
  {
    int num;

    Scanner input = new Scanner(System.in);
    num = input.nextInt();
    input.close();

    System.out.printf("The number of digits in %d is %d ",num,numDigits(num/10));
  }

  public static int numDigits(int x)
  {  
    if (x == 0)
    {return 1;}
    else
    {
      return 1 + numDigits(x/10);
    }
  }
}