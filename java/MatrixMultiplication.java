import java.util.Scanner;

public class MatrixMultiplication {
	public static void main(String[] args) {
		
		int row1,col1,i,j,k,row2,col2;
		System.out.print("Enter the order of first matrix: ");
		Scanner scanner = new Scanner(System.in);
		row1=scanner.nextInt();
		col1=scanner.nextInt();

		int matrix1[][] = new int[row1][col1];
		System.out.print("Enter the elements: ");
		for(i=0; i<row1; i++) {
			for(j=0; j<row1; j++) {
				matrix1[i][j]=scanner.nextInt();
			}
		}

		System.out.print("Enter the order of second matrix: ");
		row2=scanner.nextInt();
		col2=scanner.nextInt();
		
		int matrix2[][] = new int[row2][col2];
		System.out.print("Enter the elements: ");
		for(i=0; i<row2; i++) {
			for(j=0; j<col2; j++) {
				matrix2[i][j]=scanner.nextInt();
			}
		}

		int products[][] = new int[row1][row2];
		for(i=0; i<row1; i++) {
			for(j=0; j<col2; j++) {
				int sum=0;
				for(k=0; k<col1; k++) {
					sum+= matrix1[i][k]*matrix2[k][j];
				}
				products[i][j]=sum;
			}
		}
		System.out.println("The product of the matrix is: ");
		for(i=0;i<row1; i++) {
			for(j=0;j<col2; j++) {
				System.out.println(products[i][j] + " ");
			}
			System.out.println( );
		}		
	}
}