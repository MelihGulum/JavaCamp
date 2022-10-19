package LayeredArchitectureDemo.business;

import java.util.List;

import LayeredArchitectureDemo.core.logging.Logger;
import LayeredArchitectureDemo.dataAccess.CourseDao;
import LayeredArchitectureDemo.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private List <Course> courses;
	
	public CourseManager(CourseDao courseDao,Logger[] loggers, List <Course> courses) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}


	public void add(Course course) throws Exception {
		if (course.getCoursePrice() <= 0) {
			throw new Exception("Course price can not be lower than 0(zero) or equal to 0");

		}
		for (Course coursName : courses) {
				if(coursName.getName().equals(course.getName())) {
	                throw new Exception("Different courses have to be have different names. Can not be same as other");
				}
			}

		courseDao.add(course);
		courses.add(course);
		for(Logger logger : loggers) {
			logger.log(course.getName());
			
		}
	}
}