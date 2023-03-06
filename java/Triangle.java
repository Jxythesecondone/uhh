import java.util.Scanner;

class Triangle {

	public static void main(String[] args) {
		
		int a,n,c;
		abc p = new abc();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the no of rows: ");
		n=scanner.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println();
			for(int s=1; s<n-i+1; s++)
				System.out.print(" ");

			for(int j=0; j<=i; j++) {
				if(i==0 || j==0 || i==j) 
					c=1;
				else 
					c=p.pas(i)/(p.pas(i-j) * p.pas(j));
				System.out.print(c + " ");
			}
		}
	}
}

class abc {
	int pas(int g) {
		int f;
		for(f=1; g>1; --g) {
			f = f*g;
		}
		return f;
	}
}