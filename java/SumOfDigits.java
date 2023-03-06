//sum of digits and reverse.

import java.util.Scanner;
class SumOfDigits {
	public static void main(String[] args) {

		int s=0;
		int rev=0;
		int n;
		int m;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		n = scanner.nextInt();

		while(n>0) {
			m=n%10;
			s = s+m;
			rev = (rev * 10) + m;
			n = n/10;
		}
		System.out.println("sum=" + s);
		System.out.println("reverse=" + rev);
	}
}