package bean_with_other_bean2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t = new Teacher();
		t.setTeachcode(201);
		t.setTeacher_name("Aman_sir");
		System.out.println(t.getTeachcode());
		System.out.println(t.getTeacher_name())	;

		Student c = new Student();
				
		c.setStudent_rollno(101);
		c.setStudName("Arjun");
		c.setPc(t);
		System.out.println(c.getStudent_rollno());
		System.out.println(c.getStudName());
		System.out.println(c.getPc());
		
		
		
		
	}

}
