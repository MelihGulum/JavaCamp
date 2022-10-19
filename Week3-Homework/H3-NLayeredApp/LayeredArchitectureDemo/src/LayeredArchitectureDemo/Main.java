package LayeredArchitectureDemo;

import java.util.ArrayList;
import java.util.List;

import LayeredArchitectureDemo.business.CategoryManager;
import LayeredArchitectureDemo.business.CourseManager;
import LayeredArchitectureDemo.business.InstructorManager;
import LayeredArchitectureDemo.core.logging.DatabaseLogger;
import LayeredArchitectureDemo.core.logging.FileLogger;
import LayeredArchitectureDemo.core.logging.Logger;
import LayeredArchitectureDemo.core.logging.MailLogger;
import LayeredArchitectureDemo.dataAccess.hibernate.HibernateCategoryDao;
import LayeredArchitectureDemo.dataAccess.hibernate.HibernateInstructorDao;
import LayeredArchitectureDemo.dataAccess.jdbc.JdbcCourseDao;
import LayeredArchitectureDemo.entities.Category;
import LayeredArchitectureDemo.entities.Course;
import LayeredArchitectureDemo.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		Category category = new Category(1, "All");
		Category category2 = new Category(2, "Programming");
		List<Category> categoryDb = new ArrayList<>();
				CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers, categoryDb);
		categoryManager.add(category);
		categoryManager.add(category2);
		System.out.println("\n");

		Instructor instructor = new Instructor(1, "Engin DEMIROG");
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.add(instructor);
		System.out.println("\n");
		
		Course course1 = new Course(1, "Java2022", 100);
		List<Course> courseDb = new ArrayList<>();
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers, courseDb);
		courseManager.add(course1);

	}

}
