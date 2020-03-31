import java.util.*;
public class Main {
    public static void main(String[] args) {
        int base, powerRaised;
      Scanner sc=new Scanner(System.in);
      base=sc.nextInt();
      powerRaised=sc.nextInt();
      
        int result = power(base, powerRaised);
        System.out.printf("The value of %d power %d is %d", base, powerRaised, result);
    }
    public static int power(int base, int powerRaised) {
        if (powerRaised != 0)
            return (base * power(base, powerRaised - 1));
        else
            return 1;
    }
}