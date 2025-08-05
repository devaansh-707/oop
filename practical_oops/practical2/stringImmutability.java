package practical2;

public class stringImmutability {

	public static void main(String[] args) {
		 String greeting = "Hello";

	        greeting.concat(" World");  // this does NOT change 'greeting'
	        System.out.println("Without assignment: " + greeting);  // still "Hello"

	        greeting = greeting.concat(" World");  // now assigned
	        System.out.println("After assignment: " + greeting);    // now "Hello World"
	    }
	

	}


