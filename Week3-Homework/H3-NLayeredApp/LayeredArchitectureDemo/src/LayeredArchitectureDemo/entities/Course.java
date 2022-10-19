package LayeredArchitectureDemo.entities;

public class Course extends Base{

	private double coursePrice;
	public Course(int id, String name, double coursePrice) {
		super(id, name);
		this.coursePrice = coursePrice;
	}
	public double getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}

	


}
