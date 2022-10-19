package LayeredArchitectureDemo.dataAccess.jdbc;

import LayeredArchitectureDemo.dataAccess.InstructorDao;
import LayeredArchitectureDemo.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Instructor added to the database with JDBC");
		
	}

}
