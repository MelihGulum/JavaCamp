package LayeredArchitectureDemo.dataAccess.jdbc;

import LayeredArchitectureDemo.dataAccess.CategoryDao;
import LayeredArchitectureDemo.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Category added to the database with JDBC");
		
	}

}
