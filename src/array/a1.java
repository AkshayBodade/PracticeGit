package array;

public class a1 {

	public static void main(String[] args) {
		// declaration of array

		int[] a;
		
		// creation 
		
		a=new int[3]; // here we gave size which is 3 = 12 byte 
		
		// declaration + creation 
		
		int[] b=new int [3];
		
		// initialization
		
		a[0]=20;
		a[1]=30;
		a[2]=40;
		
	System.out.println(a[1]);
	
	// declaration+creation+initialization
	
	int[] c= { 10,20,30 };
	
	System.out.println(c[1]);
	
		for ( int b=0; b<=a.length-1; b++);
		
		System.out.println(a[b]);
		
	}

}
