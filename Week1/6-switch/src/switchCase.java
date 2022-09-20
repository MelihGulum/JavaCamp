
public class switchCase {

	public static void main(String[] args) {
		
		char grade = 'D';
		
		switch (grade) {
		case 'A':
			System.out.println("You are great buddy !!! PASSED :)");
			break;
		case 'B':
			System.out.println("Wonderfull !!! PASSED :)");
			break;
		case 'C':
			System.out.println("Great !! PASSED :)");
			break;
		case 'D':
			System.out.println("Work hard buddy !!! PASSED :)");
			break;
		case 'F':
			System.out.println("Upss !!! See you next year :)");
			break;
        default:
            System.out.println("Invalid grade !!! Be Carefull");
		
		
		}
	}

}
