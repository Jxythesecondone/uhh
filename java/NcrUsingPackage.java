import java.util.Scanner;
import fact.F;

public class NcrUsingPackage {

	public static void main(String[] args) {
		int n;
		int ncr;
		int r;
		Scanner scanner = new Scanner(System.in);
		F j = new F();

		System.out.print("Enter n: ");
		n = scanner.nextInt();
		System.out.print("Enter r: ");
		r = scanner.nextInt();

		ncr = j.fact(n)/(j.fact(r)* j.fact(n-r));
		System.out.println(ncr);

	}
}