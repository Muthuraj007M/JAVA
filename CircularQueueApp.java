package DataStructure;

import java.util.Scanner;

public class CircularQueueApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of CircularQueue");
		int n = scan.nextInt();
		CircularQueue circularqueue = new CircularQueue(n);
		while (true) {
			System.out.println("Press 1-------->INSERT");
			System.out.println("Press 2-------->DELETE");
			System.out.println("Press 3-------->DISPLAY");
			System.out.println("Press Any Number-------->STOP");
			System.out.println("Enter your choice");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				circularqueue.insert();
				break;
			case 2:
				circularqueue.delete();
				break;
			case 3:
				circularqueue.display();
				break;
			default:
				System.exit(0);
			}
		}
	}

}
