package practiceByUdmy.com;

import java.util.Scanner;

public class StudentLoan {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(" enter name ");
		String  name = in.nextLine();
		System.out.println("enter age "); 
		int age = in.nextInt();
		System.out.println("enter percentage");
		double marks = in.nextDouble();
	
		if (age >=17 && age <=21) {
			if(marks <=80) {
				
			}
			else {
				System.out.println(name +"sudent is not algible");	
			}
			System.out.println(name+"student is elgible");
		}
		else {
			System.out.println(name+"sudent is not algible");
		}
	}

}
