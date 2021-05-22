import java.util.Scanner;

public class SpyNumber {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n, sum=0, prod=1, rem, tn;
		System.out.println("--Spy Number--");
		System.out.print("Enter a number: ");
		n =	scan.nextInt();
		tn = n;
		while(tn>0) {
			rem = tn % 10;
			sum += rem;
			prod *= rem;
			tn /= 10;
		}
		System.out.printf("Sum = %d; Product = %d\n", sum, prod);
		
		System.out.print(sum==prod?(n + " is a Spy Number"):(n + " is not a Spy Number"));
	}
}