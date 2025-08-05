package practical2;

public class stringcomparision {

	public static void main(String[] args) {
		  String str1 = "Java";
	        String str2 = "Java";
	        String str3 = new String("Java");

	        System.out.println("Using == : " + (str1 == str2));         // true
	        System.out.println("Using == with new: " + (str1 == str3)); // false
	        System.out.println("Using equals(): " + str1.equals(str3)); // true
	        System.out.println("Using equalsIgnoreCase(): " + str1.equalsIgnoreCase("java")); // true
	    }
	

	}


