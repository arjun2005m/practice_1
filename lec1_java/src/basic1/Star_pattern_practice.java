package basic1;

public class Star_pattern_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			for(int i =1;i<=5;i++) {
//				System.out.println();
//				for(int j =5;j>=i;j--){
//		System.out.print("*");
//			}
//	}
//		for(int i=10;i>=1;i--) {
//			System.out.println(i);
//			}
//		===========Right angle traingle============
//		for (int i =1;i<=5;i++) {
//			System.out.println();
//			
//			for(int j=1;j<=5-i;j++) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=i;k++) {
//				System.out.print("*");
//			}
//		}
//		===============Reversse right angle traingle=====
		
//		for(int i =1;i<=5;i++) {
//			System.out.println();
//			
//			for(int j =1;j<=i-1;j++) {
//				System.out.print(" ");
//			}
//			for(int k = 1;k<=5-i+1;k++) {
//				System.out.print("*");
//			}
//		}
		
//		==============pyramid============
//		for(int i=1;i<=5;i++) {
//			System.out.println();
//			
//			for(int j =1;j<=5-i;j++) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=2*i-1;k++) {
//				System.out.print("*");
//			}
//		}
//		==============reverse pyramid===========
//		for(int i=1;i<=5;i++) {
//			System.out.println();
//			
//			for(int j =1;j<=i-1;j++) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=2*(5-i)+1;k++) {
//				System.out.print("*");
//			}
//	}
//		============Empty rectangle=========
//			for(int i =1;i<=5;i++) {
//				System.out.println();
//					
//				for(int j=1;j<=5;j++) {
//					if(i==1 || i==5 || j==1 || j==5) {
//						System.out.print("*");
//					}
//						else {
//							System.out.print(" ");
//					}
//			}
//		}
//		================empty right angle triangle=====
		
//		for(int i=1;i<=5;i++) {
//			System.out.println();
//			
//			for(int j=1;j<=i;j++) {
//				if(j==1 || j==i || i ==5 ) {
//					System.out.print("*");
//				}else {System.out.print(" ");}
//		}
//	}
		
//	==============Empty pyramid======
		
//	for(int i =1;i<=5;i++) {
//		System.out.println();
//		
//		for(int j=1;j<=5-i;j++) {
//			System.out.print(" ");
//		}
//		for(int k=1;k<=2*i-1;k++) {
//			if(i==5 || k==2*i-1 || k==1) {
//			System.out.print("*");
//			}else {System.out.print(" ");}
//		}
//	}
//	===========cross sign=======
//		int n = 5;
//
//		for (int i = 1; i <= n; i++) {
//
//		    for (int j = 1; j <= n; j++) {
//
//		        if (i == j || j == n -i+ 1) {
//		            System.out.print("*");
//		        } else {
//		            System.out.print(" ");
//		        }
//		    }
//
//		    System.out.println();
//		}
//		===========plus symbol============
//		int n =5;
//		
//		for (int i =1;i<=n;i++) {
//			System.out.println();
//			for (int j=1;j<=n;j++) {
//				if( i ==n/2+1 || j == n/2+1) {
//					System.out.print("* ");
//				}else {System.out.print("  ");}
//			}
//		}
		
////		==========Empty diamond===========
		int n =5;
		for (int i =1;i<=n;i++) {
			System.out.println();
			
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for (int k =1;k<=2*i-1;k++) {
				if(k==1 || k==2*i-1) {
					System.out.print("*");
				}else {System.out.print(" ");}
			}
		}
		for (int i =n-1;i>=1;i--) {
			System.out.println();
			
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for (int k =1;k<=2*i-1;k++) {
				if(k==1 || k == 2*i -1) {
					System.out.print("*");
				}else {System.out.print(" ");}
			}
		}
	}
}
