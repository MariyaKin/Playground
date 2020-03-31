import java.util.*;
class Main
{
  public static void main(String args[])
  {
    int a[]=new int[10];
    int i=0;
    Scanner s=new Scanner(System.in);
    String name,adres,cno,email,ptype,pid;
    System.out.println("Registration");
    for( i=0;i<10;i++)
    {
      a[i]=0;
    }
      
     System.out.println("Enter your name");
    name=s.nextLine();
     System.out.println("Enter your address");
    adres=s.nextLine();
     System.out.println("Contact Number");
    cno=s.nextLine();
     System.out.println("E-Mail ID");
    email=s.nextLine();
     System.out.println("Enter proof type");
    ptype=s.nextLine();
     System.out.println("Enter proof id");
    pid=s.nextLine();
    System.out.println("Customer Details");
    System.out.println(name);
    System.out.println(adres);
     System.out.println(cno);
     System.out.println(email);
     System.out.println(ptype);
     System.out.println(pid);
   i=1;
     
   
    System.out.println("Thank you for registering. Your id is "+i+"...");
    
    
    
    
    
    
  }
}