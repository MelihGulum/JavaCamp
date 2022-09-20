
public class recapDemo1 {

	public static void main(String[] args) {
		int no1 = 58;
		int no2 = 116;
		int no3 = 5;
		
		int biggest = no1;
		
		if (biggest < no2) {
			 biggest = no2;
		}
		
		if (biggest<no3) {
			biggest = no3;
		}
		
		System.out.println("Biggest number is: " + biggest);
	}

}