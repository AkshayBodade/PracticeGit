package a4_condstatements;

public class a4 {
	
   // nested if
	
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c=30;
		
		if(a>b) {
			
			System.out.println("a is greater than b");
			
			if(a>c) {
				
				System.out.println("a is greater than c");
				
			}
		}
		else {
			System.out.println("a is less than b");
		}
	}

}
