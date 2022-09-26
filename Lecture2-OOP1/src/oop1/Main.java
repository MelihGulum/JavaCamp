package oop1;

public class Main {

	public static void main(String[] args) {

					// set
		Product product1 = new Product();		
		product1.setName("Delonghi Coffe Machine");
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setUnitsInStock(3);
		product1.setImageUrl("whatever.jpg");

					// set
		Product product2 = new Product();
		product2.setName("Smeg Coffe Machine");
		product2.setUnitPrice(5800);
		product2.setDiscount(8);
		product2.setUnitsInStock(4);
		product2.setImageUrl("whatever2.jpg");

					// set
		Product product3 = new Product();		
		product3.setName("Kitchen Aid Coffe Machine");
		product3.setUnitPrice(5500);
		product3.setDiscount(9);
		product3.setUnitsInStock(2);
		product3.setImageUrl("whatever3.jpg");
		
		Product[] products = {product1 , product2, product3};
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("    <li>" + product.getName() + "</li>");
			
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("0123456789");
		individualCustomer.setCustomerNumber("01234");
		individualCustomer.setFirstName("Michael");
		individualCustomer.setLastName("Scott");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setGetCompanyName("Dunder Mifflin");
		corporateCustomer.setPhone("9876543210");
		corporateCustomer.setTaxNumber("43210");
		corporateCustomer.setCustomerNumber("98765");
		
		Customer[] customers = {individualCustomer, corporateCustomer};
		
		System.out.println("<ul>");
		for (Customer customer : customers) {
			System.out.println("    <li>" + customer.getId() + "</li>");
			
		}
		System.out.println("</ul>");
		
		
		

	}

}
