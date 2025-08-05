package practical2;

public class stringmanipulation {

	public static void main(String[] args) {
		 String name = "  Deva Sai  ";

	        System.out.println("Original String: '" + name + "'");
	        System.out.println("Trimmed: '" + name.trim() + "'");                
	        System.out.println("Uppercase: " + name.toUpperCase());             
	        System.out.println("Lowercase: " + name.toLowerCase());              
	        System.out.println("Replace: " + name.replace("Sai", "Kumar"));      
	        System.out.println("Substring (2–6): " + name.substring(2, 6));      
	        System.out.println("Length: " + name.length());                      
	    }
	

	}


