import java.util.Scanner;

public class AreaUsingMethodOverloading {

	public static int area(int a) {
		return a*a;
	}
	public static int area(int l, int b) {
		return l*b;
	}
	public static double area(double L, double h) {
		return 0.5*L*h;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the sides: ");
		int a=scanner.nextInt();
		System.out.print("Enter the length and breath: ");
		int l=scanner.nextInt();
		int b=scanner.nextInt();
		System.out.print("Enter the length and height: ");
		double L=scanner.nextDouble();
		double h=scanner.nextDouble();
		System.out.println(area(L,h));
	}
}
