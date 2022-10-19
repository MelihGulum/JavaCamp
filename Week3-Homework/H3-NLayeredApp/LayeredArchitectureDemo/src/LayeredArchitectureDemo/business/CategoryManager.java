package LayeredArchitectureDemo.business;

import java.util.List;

import LayeredArchitectureDemo.core.logging.Logger;
import LayeredArchitectureDemo.dataAccess.CategoryDao;
import LayeredArchitectureDemo.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger [] loggers;
	private List<Category> categories;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categories) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}

	 public void add(Category category) throws Exception {


	        for (Category categry : categories) {
	            if (categry.getName().equals(category.getName())) {
	                throw new Exception("Different categories have to be have different names. Can not be same as other");

	            }

	        }
	        categoryDao.add(category);
	        categories.add(category);
	        for (Logger logger : loggers) {
	            logger.log(category.getName());
	        }
	    }
}