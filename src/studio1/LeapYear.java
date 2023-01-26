package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your year");
		int year = scan.nextInt();
		boolean leapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
		System.out.print("is your year a leap year? " + leapYear);

	}

}
