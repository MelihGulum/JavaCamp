package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{

	// Only and only Database access codes are written here. Which is why you should know SQL.
	public void add(Product product) {
		System.out.println("Added to database with JDBC");
	}
}
