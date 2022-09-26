import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {

		findNumber();
	}
	
	public static void findNumber() {
	        int[] numbers = new int[]{1,2,5,7,9,0};
	        System.out.println("Enter a number:");
	        Scanner scan = new Scanner(System.in);
	        int enteredNumber = scan.nextInt();
	        boolean isNumberAvailable = false;

	        for (int number : numbers) {
	            if (number == enteredNumber) {
	                isNumberAvailable = true;
	                break;
	            }
	        }

	        if (isNumberAvailable) {
	        		message("Number " +enteredNumber + " is available ");
	        		scan.close();
	        }else {
	            System.out.println("Number not available");
	            scan.close();
	        }

	}
	public static void message(String msg) {
		System.out.println(msg);
	}

}
