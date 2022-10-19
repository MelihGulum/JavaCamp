package LayeredArchitectureDemo.dataAccess.hibernate;

import LayeredArchitectureDemo.dataAccess.CategoryDao;
import LayeredArchitectureDemo.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Category added to the database with Hibernate");
		
	}

}
