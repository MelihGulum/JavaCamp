package LayeredArchitectureDemo.business;

import LayeredArchitectureDemo.core.logging.Logger;
import LayeredArchitectureDemo.dataAccess.InstructorDao;
import LayeredArchitectureDemo.entities.Instructor;

public class InstructorManager {

	private InstructorDao instructorDao;
	private Logger[] loggers;
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		super();
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		for (Logger logger : loggers) {
			logger.log(instructor.getId() + " " + instructor.getName());
		}
		
	}
	
}
