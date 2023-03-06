import java.util.Scanner;
import java.lang.*;

class Get {
	Scanner scanner = new Scanner(System.in);

	int a[] = new int[10];
	void get() {
		System.out.println("Enter the marks: ");
		for(int i=1; i<=5; i++) {
			a[i]=scanner.nextInt();
		}
	}
}

	class Total extends Get {
		int s=0;
		void total() {
			for(int i=1; i<=5; i++) {
				s=s+a[i];
			}
			System.out.println("total marks=" + s);
		}
	}
	class Avg extends Total {

		void avg() {
			float avg=s/5;
			System.out.println("Average mark=" + avg);
		}

		public static void main(String[] args) {
			Avg u = new Avg();
			u.get();
			u.total();
			u.avg();
		}
	}


