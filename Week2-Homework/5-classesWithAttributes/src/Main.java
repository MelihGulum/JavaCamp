
public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("Laptop"); 
		product.setId(1);
		product.setDescription("ASUSU");
		product.setPrice(10000);
		product.setStockAmount(3);
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getCode());

	}

}