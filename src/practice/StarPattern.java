package practice;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int a=1; a<=5; a++) {
			
			//reverse loop for creating space
			
		for(int b=4; b>=a; b--) {
			
			System.out.print(" ");
		}
		for (int c=1; c<=a; c++) {
			
			System.out.print(" *");
		}
		System.out.println();
		}

	}

}
