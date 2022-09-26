
public class Methods2 {

	public static void main(String[] args) {

		String message = "The weather is very nice today.";
		String newMessage = message.substring(0,2);
		System.out.println(newMessage);
		
		int sum = addUp(5,7);
		System.out.println(sum);
		
		int sum2 =addUp2(4, 5, 6, 5, 7);
		System.out.println(sum2);

	}
	public static void add() {
		System.out.println("ADDED");
	}
	public static void delete() {
		System.out.println("DELETED");
	}
	public static void update() {
		System.out.println("UPDATED");
	}
	
	public static int addUp(int number1, int number2) {
		return number1+number2 ;
	}
	public static int addUp2(int... numbers) {
		int summed = 0;
		for(int number: numbers) {
			summed += number;
		}
		return summed;
	}
	
	public static String city() {
		return "Edinburgh";
	}
}
