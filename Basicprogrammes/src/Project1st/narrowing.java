package Project1st;

import java.util.Scanner;

public class narrowing {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a decimal number: ");
	        double d = sc.nextDouble();
	        int i = (int) d;

	        System.out.println("Double: " + d);
	        System.out.println("Converted to Int (lossy): " + i);
	        sc.close();

	}

}
