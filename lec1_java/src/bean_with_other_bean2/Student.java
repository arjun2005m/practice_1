package bean_with_other_bean2;

public class Student {

	private int Student_rollno;
	private String StudName;
	private Teacher pc;
	public int getStudent_rollno() {
		return Student_rollno;
	}
	public void setStudent_rollno(int student_rollno) {
		Student_rollno = student_rollno;
	}
	public String getStudName() {
		return StudName;
	}
	public void setStudName(String studName) {
		StudName = studName;
	}
	public Teacher getPc() {
		return pc;
	}
	public void setPc(Teacher pc) {
		this.pc = pc;
	}
}
