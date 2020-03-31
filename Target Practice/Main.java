import java.util.*;
public class Main {
public static void main(String [] args){
Scanner s=new Scanner(System.in);
  int n,a;
  int c=0,s1=0;
   n=s.nextInt();
    do
    {
        c++;
        a=s.nextInt();
        s1+=a;
      //  i++;
    }
    while(s1<n);
    //printf("The number of turns is %d",c);
System.out.print("The number of turns is " + c);
}
}