
public class Main {

	public static void main(String[] args) {

		MdasOperations mdasOperations = new MdasOperations();
		int add1 = mdasOperations.add(5, 9);
		int subs1 = mdasOperations.substraction(90, 2);
		int div1 = mdasOperations.division(100, 4);
		int mltp1 = mdasOperations.multiply(21, 3);
		
		int operations[]= new int[] {add1, subs1, div1, mltp1 };
		
		for (int i : operations) {
			System.out.println(i);
		}
	}

}
