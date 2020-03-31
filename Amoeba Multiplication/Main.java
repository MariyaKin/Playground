import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      
        int limit=s.nextInt(); 
          int previousNumber = 0, nextNumber = 1;
	     
	        int i=1;
       int sum=0 ;
	        while(i < limit)
	        {
	            //System.out.print(previousNumber+" ");
	             sum = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = sum;
	            i++;
    }
 //    System.out.print(previousNumber+" "); 
       System.out.println(+ previousNumber);
}
}