package basic1;
import java.util.Arrays;
import java.util.Scanner;
//public class Practice2 {
//	public static void main(String[] args) {
//		System.out.println("Enter your Name:");
//		Scanner sc = new Scanner(System.in);
//		
//		String a = sc.next();
//		System.out.println("welcome "+a);
//		===================================
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter 2 numbers to compare which is greater");
//		
//		System.out.println("Enter first no. ");
//		int a = sc.nextInt();
//		
//		System.out.println("Enter the second no. ");
//		int b = sc.nextInt();
//		
//		if(a>b) {
//			System.out.println("The 1st no. is greater");
//		}else if(a<b){
//			System.out.println("The 2nd no. is greater");
//		}else if(a==b) {
//			System.out.println("Both the number are same "+a+" = "+b);
//		}
//		======================================
		
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter the nuber to print the table of it: ");
//		int a = sc.nextInt();
//		
//		for(int i=1;i<=10;i++) {
//			System.out.println(a+"X"+i+"="+a*i);
//		}
//			=========================================
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++)
//			System.out.print("*");
//			System.out.println();
//		}
//	========================
//		int n=5;
//		for(int i=1;i<=5;i++) {
//			System.out.println();
//			for(int j=1;j<=i;j++)
//				
//				System.out.print("*");
//		}
//		========================
		
//	for(int i=1;i>=5;i++) {
//	}{for(int j=1;j>=i;j++)
//			System.out.print("*");
//	}
//	=======================
//		for(int i =1;i<=5;i++) {
//		
//			for(int k=5;k>=i;k--) {
//				
//				System.out.print(" ");
//			}
//				for(int j =1;j<=i;j++) {
//					System.out.print("*");
//				}
//			System.out.println("\n");
//		}
		
//		
//	}
//}
//===================loops============
public class Practice2{
	public static void main(String[] args) {
////		=========while==========
////		int a=1;
////		while(a<=5) {
////			System.out.println(a);
////			a++;
////		}
////		========do while loop=========
//		
////		int b =1;
////		do {
////			System.out.println(b);
////			b++;
////		}while(b<=10);
/// 
/// ===================array==========
		Scanner sc = new Scanner(System.in);
		
//		int [] a= {7,8,5,6,8,4,2,888,98};
//		
//		System.out.println(a.length);
//				
//		for (int i =0;i<a.length;i++) {
//			System.out.println("postion"+i+"value"+a[i]);
			
//	=========user enter array===========
//		System.out.println("Enter the length:-");
//		int h= sc.nextInt();
//		int [] b = new int[h];
//		System.out.println("Enter any "+h+" values");
//		for(int i =0;i<b.length;i++) {
//			b[i] = sc.nextInt();
//		}
//		for(int i =0;i<b.length;i++) {
////			System.out.println("position"+i+"value"+b[i]);
//			
//		}
//		System.out.println(Arrays.toString(b));
//	
//	===============max of arr==========
//		System.out.println("enter the lenght");
//		int l = sc.nextInt();
//		int [] b = new int[l];
//		System.out.println("Enter the "+ l +" values");
//		for(int i =0;i<b.length;i++) {
//			b[i] = sc.nextInt();
//		}
////		for(int i =0;i<b.length;i++) {
////			System.out.println(b[i]);
////		}
//			int max = b[0];
//			
//			for (int i =0;i<b.length;i++){
//				if(b[i]> max) {
//					max = b[i];
//				}
//			}
//			System.out.println("the max of the arr is "+max);
		
		String a = "hello arjun";
		String b = "Hello arjun";
		
		if(a.equalsIgnoreCase(b)) {
			System.out.println("match");
		}else {System.out.println("not match");}
			
			
			
			
			
			
		
		}
		}

