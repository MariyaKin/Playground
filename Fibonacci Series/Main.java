import java.util.*;
public class Main
{ 
  public static void main (String args[]) 
    { 
      Scanner sc=new Scanner(System.in);
    int n=sc.nextInt() ; 
      int i;
      int n1=0,n2=1;
      int n3;
    for(i=2;i<=n;++i)    
 {    
  n3=n1+n2;    
      if(i==n-1)
      {
  System.out.printf("The term %d in the fibonacci series is %d",n,n3); 
      }
  n1=n2;    
  n2=n3;    
 }    
    } 
} 