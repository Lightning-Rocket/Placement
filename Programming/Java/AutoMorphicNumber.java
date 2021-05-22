// AutoMorphic Number
import java.util.Scanner;

public class AutoMorphicNumber {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n;
		System.out.println("--AutoMorphic Number--");
		System.out.print("Enter a number: ");
		n = scan.nextInt();
		
		System.out.print(n==LastDigit(countDigit(n), n*n)?(n + " is a AutoMorphic Number"):(n + " is not a AutoMorphic Number"));
	}
	
	public static int countDigit(int n) {
		int rem, digit=0;
		while (n>0) {
			rem = n % 10;
			digit += 1;
			n /= 10;
		}
		return digit;
	}
	
	public static int LastDigit(int count, int n) {
		int lastDigit=0, rem, dig=1;
		for(int i=0;i<count;i++) {
			rem = n % 10;
			lastDigit = rem*dig + lastDigit;
			dig *= 10;
			n /= 10;
		}
		return lastDigit;
	}
}