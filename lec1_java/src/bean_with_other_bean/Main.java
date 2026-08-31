package bean_with_other_bean;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PersonBean p = new PersonBean();
		System.out.println("Enter Persin ID");
		p.setPerid(sc.nextInt());
		System.out.println("Enter Persin Name");
		p.setPername(sc.next());
		
		System.out.println("Person Id "+ p.getPerid());
		System.out.println("Person name "+ p.getPername());
		
		
		ProfBean b = new ProfBean();
		System.out.println("Enter Prof ID");
		b.setProid(sc.nextInt());
		System.out.println("Enter Prof Name");
		b.setProname(sc.next());
		b.setPc(p);
		
		System.out.println("Prof ID"+ b.getProid());
		System.out.println("Prof name "+ b.getProname());
		System.out.println("Person name");
		System.out.println(b.getPc());
	}
}
