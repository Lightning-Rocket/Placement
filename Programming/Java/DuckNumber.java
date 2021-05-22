// Duck Number

// AutoMorphic Number
import java.util.Scanner;

public class DuckNumber {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n, rem, tn;
		boolean zero=false;
		System.out.println("--Duck Number--");
		System.out.print("Enter a number: ");
		n = scan.nextInt();
		tn = n;
		while (tn > 0) {
			rem = tn % 10;
			if (rem == 0){
				zero = true;
				break;
			}
			tn /= 10;
		}
		
		System.out.print(zero?(n + " is a Duck Number"):(n + " is not a Duck Number"));
	}
}