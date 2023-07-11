package DataStructure;

import java.util.Scanner;

public class DoublyLinkedListApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DoublyLinkedList dll = new DoublyLinkedList();
		while (true) {
			System.out.println("Press 1--------->Insertfront");
			System.out.println("Press 2--------->Deletefront");
			System.out.println("Press 3--------->Insertrear");
			System.out.println("Press 4--------->Deleterear");
			System.out.println("Press 5--------->Display forward");
			System.out.println("Press 6--------->Display reverse");
			System.out.println("Press Any other number--------->STOP");
			System.out.println("Enter your choice");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				dll.insertfront();
				break;
			case 2:
				dll.deletefront();
				break;
			case 3:
				dll.insertrear();
				break;
			case 4:
				dll.deleterear();
				break;
			case 5:
				dll.displayforward();
				break;
			case 6:
				dll.displayreverse();
				break;
			default:
				System.exit(0);
			}
		}
	}

}
