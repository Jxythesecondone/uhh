import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		
		String str;
		int f=1;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the string: ");
		str=scanner.nextLine();

		for(int i=0; i<str.length()/2; i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
				f=0;
				break;
			}
		}

		if(f==1) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}
}