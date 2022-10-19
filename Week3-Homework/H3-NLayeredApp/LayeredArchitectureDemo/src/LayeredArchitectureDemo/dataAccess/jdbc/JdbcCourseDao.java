package LayeredArchitectureDemo.dataAccess.jdbc;

import LayeredArchitectureDemo.dataAccess.CourseDao;
import LayeredArchitectureDemo.entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Course added to the database with JDBC");
	}

}
