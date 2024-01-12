package practiceByUdmy.com;

import java.util.Scanner;

public class Leapyear {
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		System.out.println("enter a yaer");
		int year = console.nextInt();     /// 2000,1992
		if ((year % 4 == 0) && ((year % 400 == 0) || (year % 100 != 0))) {
			System.out.println("enterd year is leap yaear ");	
		}
		else {
			System.out.println("enterd year is not leap year");	
			
		}
		
		
	}

}
