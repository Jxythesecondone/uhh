package customer;
import java.util.Scanner;
import java.io.*;

public class Bank {
	int acno;
	String name;
	double balance;
	double c;
	double b;
	Scanner scanner = new Scanner(System.in);

	public void Bank() {

		System.out.println("Enter the accno: ");
		acno=scanner.nextInt();
		System.out.println("Enter the name: ");
		name=scanner.nextLine();
		System.out.println("Enter the balance: ");
		balance=scanner.nextDouble();
	}

	public void deposit() {
		System.out.println("Enter the amount to be deposited: ");
		double c=scanner.nextDouble();
		balance = balance+c;
		System.out.println("Successfully deposited" + c);
	}

	public void withdraw() {
		System.out.println("Enter the amount to withdraw: ");
		double b=scanner.nextDouble();

		if(balance>b) {
			System.out.println("Successfully withdrawn rs: " + b);
			balance = balance-b;
		} else {
			System.out.println("Not possible");
		}
	}

	public void display() {
		System.out.println("Account details");
		System.out.println("Account number: " + acno);
		System.out.println("Name: " + name);
		System.out.println("Balance: " + balance);
	}
}