// Fascinating Numbers
import java.util.Scanner;

public class FascinatingNumbers {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n;
		System.out.println("--Fascinating Number--");
		System.out.print("Enter a number: ");
		n = scan.nextInt();
		
		String num = Integer.toString(n) + Integer.toString(n*2) + Integer.toString(n*3);
		String otn = "123456789";
		
		System.out.print(num);
		
		
		
		
		// System.out.print(?(n + " is a Fascinating Number"):(n + " is not a Fascinating Number"));
	}
}