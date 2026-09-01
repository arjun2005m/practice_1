package beanwith_array_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Mianclass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter detail_1 for \n Course ID\n course name \n course fees");
		Course_bean pc = new Course_bean(sc.nextInt(),sc.next(),sc.nextDouble());
		
		ArrayList<Course_bean> a = new ArrayList<Course_bean>();
		
		
		a.add(pc);
		System.out.println("Enter detail_2 for \n Course ID\n course name \n course fees");
		a.add(new Course_bean(sc.nextInt(),sc.next(),sc.nextDouble()));
		System.out.println("Enter detail_3 for \n Course ID\n course name \n course fees");
		a.add(new Course_bean(sc.nextInt(),sc.next(),sc.nextDouble()));
		
		
		Iterator<Course_bean> iter=a.iterator();
	
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
