package student_detalil;

public class StudBean {

	private int studrollno;
	private String studname;
	private double studfees;
	
	public void setstudrollno(int rollno) {
		this.studrollno=rollno;
	}
	public int getstudrollno() {
		return studrollno;
	}
	
	public void setstudname(String name) {
		this.studname=name;
	}
	public String getstudname() {
		return studname;
	}
	
	public void setstudfees(double fees) {
		this.studfees=fees;
	}
	public double getstudfees() {
		return studfees;
	}
}
