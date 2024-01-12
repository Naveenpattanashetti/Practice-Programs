package practiceByUdmy.com;

import java.util.Scanner;

///The simple way to check if the squared of the hypotenuse is //
//equal to the sum of the squared of the perpendicular and base //
public class TriangleValidator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the hypotness");
		int h = sc.nextInt();
		System.out.println("enter the perpendiculr");
		int p = sc.nextInt();
		System.out.println("enter the base ");
		int b = sc.nextInt();

		if ((h * h == (p * p) + (b * b))) {
			System.out.println("Right Angled Triangle");
		} else {
			System.out.println(" Not Right Angled Triangle");
		}

	}

}
