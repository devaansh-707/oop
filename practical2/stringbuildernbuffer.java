package practical2;

public class stringbuildernbuffer {

	public static void main(String[] args) {
		  StringBuilder sb = new StringBuilder("Hello");
	        sb.append(" World");
	        sb.insert(5, " Java");
	        System.out.println("StringBuilder: " + sb);

	        StringBuffer sbf = new StringBuffer("Good");
	        sbf.append(" Morning");
	        sbf.replace(0, 4, "Great");
	        System.out.println("StringBuffer: " + sbf);
	    }
	

	}


