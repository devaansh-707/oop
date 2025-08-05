package mypackage;

import java.util.Scanner;

class control_statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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


