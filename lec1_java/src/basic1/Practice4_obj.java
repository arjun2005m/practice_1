package basic1;

import java.util.Scanner;

public class Practice4_obj {
	static Scanner sc = new Scanner(System.in);
//	public void Add() {
//		int a= 10, b = 15;
//		System.out.println("addition"+(a+b));
//		
//	}
//	public void sub() {
//		int c =10, d =5;
//		System.out.println("subtraction"+ (c-d));
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Practice4_obj m= new Practice4_obj();
//		
//		m.Add();
//		m.sub();
	
//	===================================
//	public void sub (int a, int b, int c, int d) {
//		System.out.println("Substraction"+(a-b-c-d));
//	}
	
//	public int mul() {
//		
//	return 5*4;
//	}
//	public static void main(String[] args) {
//		Practice4_obj m = new Practice4_obj();
////		m.sub(25, 20, 15, 10);
//		System.out.println("Multiplication is "+ m.mul());
//	}

//	==============Static method===============
	
//	public static void Pinverify() {
//		Scanner sc = new Scanner(System.in);
//		String pin = "1212";
//		
//		System.out.println("Enter your Pin");
//		String p =sc.next();
//		
//		if(pin.equals(p)) {
//			System.out.println("pin is valid");
//		}else {System.err.println("pin is invalid");
//		Pinverify();
//		}
//	}
//	public static void main(String[] args) {
//		Pinverify();
//	}
	
//	=================Atm machine =================
//	static double bal=0.0;
//	public static void deposit() {
//		
//		System.out.println("Enter the amount to deposit:- ");
//		double dep = sc.nextDouble();
//		
//		if (dep>=100) {
//			bal = bal+ dep;
//			System.out.println(dep+" amount has been sucessfully Deposited");
//		}else {System.out.println("plesase enter the amount greater that Rs. 100");
//		deposit();}
//	}
//	
//	
//	public static void withdrawl() {
//		
//		System.out.println("Enter the amount to widthdraw:- ");
//		double wid = sc.nextDouble();
//		
//		if (wid>=100 && wid<=bal) {
//			bal = bal-wid;
//			System.out.println(wid+" amount has been sucessfully Withdrawed");
//		}else if(wid<=100) {System.out.println("plesase enter the amount greater that Rs. 100");
//		}else if(wid>bal) {System.out.println("Insufficient funds");
//		withdrawl();}
//	}
//	
//	
//	
//	public static void checkbalance() {
//		
//	}
//	public static void choice() {
//		while(true){
//		System.out.println("Enter you choice.\n1.Deposit \n2.Withdraw .\n3.CheckBalance.\n4.Exit");
//		int a =sc.nextInt();
//		switch(a) {
//		case 1:
//			deposit();
//			break;
//		case 2:
//			withdrawl();
//			break;
//		case 3:
//			System.out.println("You current Balance is "+ bal);
//			break;
//		case 4:
//			System.out.println("Thank You!");
//			return;
//		default:
//			System.err.println("Invalid choice");
//		}
//	}
//	}
//	public static void pinverify() {
//		String pin1 ="1111";
//		
//		System.out.println("Please enter your pin:-");
//		String pin2 = sc.next();
//		
//		for(int i=1;i<=3;i++) {
//			
//			if (i<=2) {
//				
//				if(pin1.equals(pin2)) {
//					System.out.println("pin is valid");
//					choice();
//					break;
//				}
//				else {
//					System.out.println("Your pin is invalid. Retry");
//					pin2 = sc.next();
//				}
//			}
//			else if (i ==3) {
//				if(pin1.equals(pin2)) {
//					System.out.println("pin is valid");
//					choice();
//					break;
//			}
//				else {
//					System.out.println("You have reached your limit. Acc blocked....");
//				}
//		}
//		
//	}
//	}
//	public static void main(String[] args) {
//		pinverify();
//	}
//}
//=====================atm with trnastion method()=====================================
	
	static double bal=0.0;
	public static void deposit() {
		
		System.out.println("Enter the amount to deposit:- ");
		double dep = sc.nextDouble();
		
		if (dep>=100) {
			bal = bal+ dep;
			System.out.println(dep+" amount has been sucessfully Deposited");
		}else {System.out.println("plesase enter the amount greater that Rs. 100");
		deposit();}
	}
	
	
	public static void withdrawl() {
		
		System.out.println("Enter the amount to widthdraw:- ");
		double wid = sc.nextDouble();
		
		if (wid>=100 && wid<=bal) {
			bal = bal-wid;
			System.out.println(wid+" amount has been sucessfully Withdrawed");
		}else if(wid<=100) {System.out.println("plesase enter the amount greater that Rs. 100");
		}else if(wid>bal) {System.out.println("Insufficient funds");
		withdrawl();}
	}
	
	public static void transaction() {

	    while(true) {

	        choice();

	        System.out.println("Do you want to continue? Yes/No");
	        String option = sc.next();

	        if(option.equalsIgnoreCase("yes")) {
	        }
	        else if(option.equalsIgnoreCase("no")) {
	            System.out.println("Thank you for using our service...");
	            break;
	        }
	        else {
	            System.out.println("Invalid option. Please enter Yes or No.");
	        }
	    }
	}
	
	public static void checkbalance() {
		
	}
	public static void choice() {
		
		System.out.println("Enter you choice.\n1.Deposit \n2.Withdraw .\n3.CheckBalance.");
		int a =sc.nextInt();
		switch(a) {
		case 1:
			deposit();
			break;
		case 2:
			withdrawl();
			break;
		case 3:
			System.out.println("You current Balance is "+ bal);
			break;
		
		default:
			System.err.println("Invalid choice");
		}
	}
	
	public static void pinverify() {
		String pin1 ="1111";
		
		System.out.println("Please enter your pin:-");
		String pin2 = sc.next();
		
		for(int i=1;i<=3;i++) {
			
			if (i<=2) {
				
				if(pin1.equals(pin2)) {
					System.out.println("pin is valid");
					transaction();
					break;
				}
				else {
					System.out.println("Your pin is invalid. Retry");
					pin2 = sc.next();
				}
			}
			else if (i ==3) {
				if(pin1.equals(pin2)) {
					System.out.println("pin is valid");
					transaction();
					break;
			}
				else {
					System.out.println("You have reached your limit. Acc blocked....");
				}
		}
		
	}
	}
	public static void main(String[] args) {
		pinverify();
	}
}
