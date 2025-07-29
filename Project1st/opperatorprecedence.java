package Project1st;

public class opperatorprecedence {

	public static void main(String[] args) {
		int exp1 = 10 + 2 * 5;          // 10 + (2*5) = 20
        int exp2 = (10 + 2) * 5;        // (10+2)*5 = 60
        int exp3 = 100 / 5 + 2 * 3 - 4; // (100/5) + (2*3) - 4 = 20 + 6 - 4 = 22

        System.out.println("10 + 2 * 5 = " + exp1);
        System.out.println("(10 + 2) * 5 = " + exp2);
        System.out.println("100 / 5 + 2 * 3 - 4 = " + exp3);
    }


	}


