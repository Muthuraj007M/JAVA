package DataStructure;

import java.util.Scanner;

public class ArrayApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of Array");
		int n = scan.nextInt();
		Array ar = new Array(n);
		while (true) {
			System.out.println("Press 1--------->INSERT");
			System.out.println("Press 2--------->DELETE");
			System.out.println("Press 3--------->DISPLAY");
			System.out.println("Press Any Number--------->STOP");
			System.out.println("Enter your choice");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				ar.insert();
				break;
			case 2:
				ar.delete();
				break;
			case 3:
				ar.display();
				break;
			default:
				System.exit(0);
			}
		}
	}

}
