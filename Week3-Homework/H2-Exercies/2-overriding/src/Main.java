
public class Main {

	public static void main(String[] args) {
		BaseCreditManager[] baseCreditManager = new BaseCreditManager[] {new TeacherCreditManager(),
																		new AgricultureCreditManager(),
																		new PupilCreditManager()};
		
		for (BaseCreditManager baseCreditManager2 : baseCreditManager) {
			System.out.println(baseCreditManager2.calculate(1000));
		}
	}

}
