
public class Classes {

	public static void main(String[] args) {
		
				//Reference Type
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();
		customerManager.Delete();
		customerManager.Update();
		
		
				//value
		int number1 = 5;
		int number2 = 7;
		number2 = number1;
		number1=100;
		System.out.println(number2);
		
		        //arrays are belongs to reference type
		int numbers1[] = new int[] {1, 2, 3} ;
		int numbers2[] = new int[] {4, 5, 6} ;
		numbers2 = numbers1;
		numbers1[0]=100;
		System.out.println(numbers2[0]);
	} 

}
