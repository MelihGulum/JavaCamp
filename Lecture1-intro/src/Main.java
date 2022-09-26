
public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		String text = "This is a string variable";
		System.out.println(text);
		
		int expiry = 12;
		double dolarYesterday = 18.22;
		double dolarToday = 18.20;
		
		boolean isDolarDecrease = true;
		
		String arrowDirection = "";
		
		if (dolarToday < dolarYesterday) {
			arrowDirection = "down.svg";
			System.out.println(arrowDirection);
		} else if(dolarToday > dolarYesterday) {
			arrowDirection = "up.svg";
			System.out.println(arrowDirection);
		}
		else {
			arrowDirection = "balance.svg";
			System.out.println(arrowDirection);
		}
		
		String[] credits = {"Fast Credit", "Happy Retire","House Credit"};
		for (int i = 0; i < credits.length; i++) {
			System.out.println(credits[i]);
		}
	}

}
