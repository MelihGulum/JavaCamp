package LayeredArchitectureDemo.dataAccess.hibernate;

import LayeredArchitectureDemo.dataAccess.CourseDao;
import LayeredArchitectureDemo.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Course added to the database with Hibernate");
		
	}

}
