
public class ProductValidator {
	
	
	static {
		System.out.println("Static Constructor !!!");
	}
	
	public ProductValidator() {
		System.out.println("Constructor !!!");
	}

	public static boolean isValid(Product product) {
		if(product.price > 0 && ! product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public void something() {
		
	}
	
}
