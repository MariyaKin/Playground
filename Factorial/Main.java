import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
    {
        int n, mul;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        Main obj = new Main();
        mul = obj.fact(n);
        System.out.println("The factorial of "+n+ " is "+mul);
    }
    int fact(int x)
    {
        if(x > 1)
        {
            return(x * fact(x - 1));
        }
        return 1;
    }
}