// Emirp Number
import java.util.Scanner;

public class EmirpNumber {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n;
		System.out.println("--Emirp Number--");
		System.out.print("Enter a number: ");
		n = scan.nextInt();
		
		System.out.print(isPrime(n)?(isPrime(n) == isPrime(reverse(n))?(n + " is a Emirp Number"):(n + " is not a Emirp Number")):(n + " is not a Prime Number"));
	}

	public static boolean isPrime(int n) {
		int flag=0;
		for (int i=2;i<=n;i++) {
			if (n%i == 0)
				flag += 1;
		}
		if (flag==1)
			return true;
		else
			return false;
	}

	public static int reverse(int n) {
		int rem, rev=0;
		while (n>0) {
			rem = n % 10;
			rev = rev*10 + rem;
			n /= 10;
		}
		return rev;
	}
}