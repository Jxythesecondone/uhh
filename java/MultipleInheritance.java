import java.util.Scanner;
interface year {
	int gets();
}
interface age {
	void puts(int y);
}

class Find implements year, age {
	Scanner scanner = new Scanner(System.in);
	int ye,ag;
	public int gets() {
		System.out.println("Enter your age: ");
		ye=scanner.nextInt();
		return ye;
	}
	public void puts(int y) {
		ag=2023-y;
		System.out.println("your age is: " + ag);
	}
}

class MultipleInheritance {
	public static void main(String[] args) {
		Find f = new Find();
		int b = f.gets();
		f.puts(b);
	}
}