
public class ProductManager {

	public void add(Product product) {
		if(ProductValidator.isValid(product)) {
			System.out.println("ADDED");
			
		}else {
			System.out.println("Product informations are invalid");
		}
		
		//ProductValidator validator = new ProductValidator();
		//validator.something();
	
	}
}
