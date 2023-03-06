import java.util.Scanner;

class Uhh {

	int large(int x, int y) {
		if(x>y) {
			return x;
		} else {
			return y;
		}
	}

	int large(int x) {
		int l;
		int r;
		l=x%10;

		while(x>0) {
			r=x%10;
			if(l<r) {
				l=r;
			}
			x=x/10;
		}
		return l;
	}

	int large(int x, int y, int z) {
		if(x>y && x>z) {
			return x;
		}
		else if(y>x && y>z) {
			return y;
		} else {
			return z;
		}
	}
}
public class LargestUsingOverloading {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Uhh obj = new Uhh();
		int a;
		int b;
		int c;

		System.out.println("Largest among two numbers: ");
		System.out.println("Enter two numbers: ");
		a=scanner.nextInt();
		b=scanner.nextInt();
		System.out.println("largest =" + obj.large(a,b));

		System.out.println("largest digit in a number: ");
		System.out.println("Enter the number: ");
		a=scanner.nextInt();

		System.out.println("Largest=" + obj.large(a));

		System.out.println("largest among three numbers");
		System.out.println("Enter the numbers: ");

		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();

		System.out.println("Largest=" + obj.large(a,b,c));
	}
}