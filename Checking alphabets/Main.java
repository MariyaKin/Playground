import java.util.Scanner;
import java.io.*;
class Main
{
    public static void main(String args[])
    {
  //nBufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   Scanner br=new Scanner(System.in);
      char ch;
     ch= br.nextLine().charAt(0); 
      
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
        {
            System.out.println("Vowel");
        }
     else  if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
       {
        System.out.println("Consonant");
           
    }
        else
        {
           System.out.println("Not an alphabet");

        }
         
         
         
         
         
         
    }
}