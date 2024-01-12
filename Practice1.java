package practiceByUdmy.com;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {

//		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks");
		int num = sc.nextInt();

		if (num >= 50) {
			System.out.println("the sudent is pass");
		} else
			System.out.println("Fail");

	}
	

}
