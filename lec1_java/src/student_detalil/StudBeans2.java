package student_detalil;

import java.util.Scanner;

public class StudBeans2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StudBean s = new StudBean();
		System.out.println("enter Student rollno: ");
		s.setstudrollno(sc.nextInt());
		System.out.println("enter Student Name: ");
		s.setstudname(sc.next());
		System.out.println("enter Student Fees: ");
		s.setstudfees(sc.nextDouble());
		
		
		
		System.out.println("Student Roll no: "+ s.getstudrollno());
		System.out.println("Student Name: "+ s.getstudname());
		System.out.println("Student Fees: "+ s.getstudfees());
	}

}
