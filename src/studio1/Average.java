package studio1;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1;
		int n2;
		
		System.out.println("What are the two integers you would like to average?");
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		
		double average;
		average = (((double)(n1)) + n2)/2;
		
		System.out.println("Your average is " + average);
	}

}
