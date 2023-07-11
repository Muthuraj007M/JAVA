package DataStructure;

import java.util.Scanner;

public class StackApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of Stack");
		int n = scan.nextInt();
		Stack stack = new Stack(n);
		while (true) {
			System.out.println("Press 1------>INSERT");
			System.out.println("Press 2------>DELETE");
			System.out.println("Press 3------>DISPLAY");
			System.out.println("Press Any Number------>STOP");
			System.out.println("Enter your Choice");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				stack.push();
				break;
			case 2:
				stack.pop();
				break;
			case 3:
				stack.display();
				break;
			default:
				System.exit(0);
			}
		}
	}
}
