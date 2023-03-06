import java.util.Scanner;
import customer.Bank;

public class BankTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Bank k = new Bank();
		int ch;

		do {
			System.out.println("Menu");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Display");
			System.out.println("Enter your choice: ");
			ch=scanner.nextInt();

			switch(ch) {

				case 1: k.deposit();
					break;
				case 2: k.withdraw();
					break;
				case 3: k.display();
					break;
				default: System.out.println("Wrong choice");
			}
		}
		while(ch<=3);
	}
}