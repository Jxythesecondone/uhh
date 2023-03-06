import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		
		int n;
		int l;	
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number: ");
		n = scanner.nextInt();
		System.out.print("Enter the limit: ");
		l = scanner.nextInt();

		for(int i=1; i<=l; i++) {
			System.out.println(i + "*" + n + "=" + i*n);
		}
	}
}