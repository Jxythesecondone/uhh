import java.util.Scanner;

public class sorting {
	public static void main(String[] args) {
		int i;
		int j;
		int n;
		int temp;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size: ");
		n = scanner.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter the elements: ");
		for (i=0; i<n; i++) {
			arr[i] = scanner.nextInt();
		}
		for(i =0; i<n; i++) {
			for(j=i+1;j<n; j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted array: ");
		for (i=0; i<n; i++) {
			System.out.println(arr[i]);
			
		}
	}
}