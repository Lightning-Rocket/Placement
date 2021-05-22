// Evil Number
import java.util.Scanner;

public class EvilNumber {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n, bin=0, rem, tn, dig=1, count=0;;
		System.out.println("--Evil Number--");
		System.out.print("Enter a number: ");
		n = scan.nextInt();
		
		// INTtoBIN(n);
		
		tn = n;
		while (tn != 0) {
			rem = tn % 2;
			if (rem==1)
				count += 1;
			tn /= 2;
			bin += rem*dig;
			dig *= 10;
		}
		
		System.out.print(count%2==0?(n + " is a Evil Number"):(n + " is a Odious Number"));
	}
	
	// public static int INTtoBIN(int n) {
		// int bin=0, rem, dig=1;
		
		// while (n != 0) {
			// rem = n % 2;
			// n /= 2;
			// bin += rem*dig;
			// dig *= 10;
		// }
		// return bin;
	// }
}