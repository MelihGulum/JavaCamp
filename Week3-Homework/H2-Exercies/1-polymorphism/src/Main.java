
public class Main {

	public static void main(String[] args) {
		BaseLogger[] loggers = new BaseLogger[]{new DatabaseLogger(), new FileLogger(), new EmailLogger(),
												new ConsoleLogger()};
	
	for (BaseLogger baseLogger : loggers) {
		baseLogger.log("Log message");
		
		}
	System.out.println("\n**********************\n");
	CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
	customerManager.add();
	
	}

}
