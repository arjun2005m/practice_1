package bean_with_other_bean2;

public class Teacher {
	private int teachcode;
	private String teacher_name;
	public int getTeachcode() {
		return teachcode;
	}
	public void setTeachcode(int teachcode) {
		this.teachcode = teachcode;
	}
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}
	@Override
	public String toString() {
		return "Teacher [teachcode=" + teachcode + ", teacher_name=" + teacher_name + "]";
	}
	
}
