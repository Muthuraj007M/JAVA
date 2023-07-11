package DataStructure;

import java.util.Scanner;

public class SinglyLinkedDataStructureApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SinglyLinkedDataStructure sll = new SinglyLinkedDataStructure();
		while (true) {
			System.out.println("Press 1--------->Insertfront");
			System.out.println("Press 2--------->Deletefront");
			System.out.println("Press 3--------->Insertrear");
			System.out.println("Press 4--------->Deletefront");
			System.out.println("Press 5--------->Display");
			System.out.println("Press Any other number--------->STOP");
			System.out.println("Enter your choice");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				sll.insertfront();
				break;
			case 2:
				sll.deletefront();
				break;
			case 3:
				sll.insertrear();
				break;
			case 4:
				sll.deleterear();
				break;
			case 5:
				sll.display();
				break;
			default:
				System.exit(0);
			}
		}
	}

}
