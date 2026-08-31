package basic1;

public class practice7_constructor {
	
	practice7_constructor(){
		int a =5,b=10;
		System.out.println("add"+(a+b));
	}
	
	public void sub() {
		int a =10,b=5;
		System.out.println("sub"+ (a-b));
	}
	public static void main(String[] args) {
		practice7_constructor s = new practice7_constructor();
		s.sub();
		
	}
}
