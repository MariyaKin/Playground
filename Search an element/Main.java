import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      
       int n, x, flag = 0, i = 0;
        Scanner s = new Scanner(System.in);
      
        n = s.nextInt();
        int a[] = new int[n];
        
        for(i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
    
        x = s.nextInt();
        for(i = 0; i < n; i++)
        {
            if(a[i] == x)
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            System.out.println(+x+" is present in the array");
        }
        else
        {
            System.out.println(+x+" is not present in the array");
        }
    
    }
}