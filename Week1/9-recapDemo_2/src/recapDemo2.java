
public class recapDemo2 {

	public static void main(String[] args) {
		
		double[] myList = {1.4, 1.5, 2.9, 23.5};
		double total = 0;
		double max = myList[0];
		
		for(double number:myList) {
			if(max < number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}
		System.out.println("\nTotal: "+ total);
		System.out.println("Max: "+ max);
	}

}
