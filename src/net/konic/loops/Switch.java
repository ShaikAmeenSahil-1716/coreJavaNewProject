package net.konic.loops;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter option (1-5): ");
		int option = sc.nextInt();

		switch (option) {
		case 1:
			System.out.println("SHAIK");
			break;
		case 2:
			System.out.println("AMEEN");
			break;
		case 3:
			System.out.println("SAHIL");
			break;
		case 4:
			System.out.println("KING");
			break;
		default:
			System.out.println("Invalid Option");
		}
System.out.println("ASSALAMWALIKUM");
		sc.close();
	}
}