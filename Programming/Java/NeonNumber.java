// Neon Number
import java.util.Scanner;

public class NeonNumber {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n;
		
		System.out.print("Enter a number: ");
		n = scan.nextInt();
		
		System.out.printf("Sum = %d; SquareSum = %d\n", DigitSum(n), DigitSum(n*n));
		
		System.out.print(DigitSum(n)==DigitSum(n*n)?(n + " is a Neon Number"):(n + " is not a Neon Number"));
	}
	
	public static int DigitSum(int n) {
		int sum=0, rem, tn;
		tn = n;
		
		while (n>0) {
			rem = n % 10;
			sum += rem;
			n /= 10;
		}
		
		return sum;
	}
}