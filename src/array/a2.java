package array;

public class a2 {

	public static void main(String[] args) {
		// declaration 
		
		int[][] a;
		
		// creation 
		
		a=new int[2][3];   // row=2 , column=3
		 
		// declaration+initialization
		
		int[][] b=new int[2][3];
		
        //initialization
		
		a[0][1]=10;
		a[1][1]=50;
		a[1][2]=100;
		
		System.out.println(a[0][0]);
		System.out.println(a[1][0]);
		
	}

}
