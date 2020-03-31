import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		String string ;
      Scanner sc=new Scanner(System.in);
      string=sc.nextLine();
		string = string.replaceAll("[AaEeIiOoUu]", "");
		System.out.println(string);
	}
}
 
