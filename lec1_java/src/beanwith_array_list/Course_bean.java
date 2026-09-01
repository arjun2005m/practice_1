package beanwith_array_list;

public class Course_bean {
	
	private int courseid;
	private String coursename;
	private double coursefees;
	
	Course_bean (int id, String name, double fees ){
		this.courseid=id;
		this.coursename=name;
		this.coursefees=fees;
		
	}

	@Override
	public String toString() {
		return " courseid=" + courseid + ", coursename=" + coursename + ", coursefees=" + coursefees ;
	}
	
}

