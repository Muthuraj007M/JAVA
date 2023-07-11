package DataStructure;

import java.util.Scanner;

public class CircularQueue {
	private int cq[];
	private int size;
	private int f = 0;
	private int r = -1;
	private int count = 0;
	private Scanner scan = new Scanner(System.in);

	public CircularQueue(int n) {
		cq = new int[n];
		size = cq.length;
	}

	public void insert() {
		if (count == size) {
			System.out.println("Insertion Not Possible");
		} else {
			System.out.println("Enter an Element");
			int elem = scan.nextInt();
			r = (r + 1) % size;
			cq[r] = elem;
			count++;
		}
	}

	public void delete() {
		if (count == 0) {
			System.out.println("Deletion Not Possible");
		} else {
			System.out.println("Deleted Element is " + cq[f]);
			f = (f + 1) % size;
			count--;
		}
	}

	public void display() {
		if (count == 0) {
			System.out.println("Display Not Possible");
		} else {
			int f1 = f;
			if (count == 0) {
				System.out.println("Display Not Possible");
			} else {
				for (int i = 1; i <= count; i++) {
					System.out.print(cq[f1] + " ");
					f1 = (f1 + 1) % size;
				}
				System.out.println();
			}
		}
	}
}
