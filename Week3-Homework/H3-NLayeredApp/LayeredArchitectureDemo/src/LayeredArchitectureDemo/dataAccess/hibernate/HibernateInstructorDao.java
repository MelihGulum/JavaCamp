package LayeredArchitectureDemo.dataAccess.hibernate;

import LayeredArchitectureDemo.dataAccess.InstructorDao;
import LayeredArchitectureDemo.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Instructor added to the database with Hibernate");
		
	}

}
