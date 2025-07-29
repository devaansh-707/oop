package practical1;

import java.util.Scanner;

public class Controll {
	public static void main(String[] args) {
	    Scanner Scanner = new Scanner(System.in);
	    System.out.printf("Enter a year: ");
	    int year = Scanner.nextInt();

	    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	        System.out.printf("%d is a Leap Year.\n", year);
	    } else {
	        System.out.printf("%d is NOT a Leap Year.\n", year);
	    }
	}

}
