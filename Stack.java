package DataStructure;

import java.util.Scanner;

public class Stack {
	private int s[];
	private int size;
	private int top = -1;
	private Scanner scan = new Scanner(System.in);

	public Stack(int n) {
		s = new int[n];
		size = s.length;
	}

	public void push() {
		if (top == size - 1) {
			System.out.println("Push Not Possible");
		} else {
			System.out.println("Enter an Element");
			int elem = scan.nextInt();
			top++;
			s[top] = elem;
		}
	}

	public void pop() {
		if (top == -1) {
			System.out.println("Pop Not possible");
		} else {
			System.out.println("Popped Element is " + s[top]);
			--top;
		}
	}

	public void display() {
		if (top == -1) {
			System.out.println("Display Not Possible");
		} else {
			for (int i = 0; i <= top; i++) {
				System.out.print(s[i] + " ");
			}
			System.out.println();
		}
	}
}
