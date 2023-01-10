package a9_StringMethods;

public class a8 {

	public static void main(String[] args) {

		String a = "hi@my@name@is@jerry";
		
		String [] b=a.split ("@");
		
		String b1=b[0];
		String b2=b[1];
		String b3=b[2];
		String b4=b[3];
		String b5=b[4];
		
		
		
		
		System.out.println(b2+" "+b3+" "+b4+" "+b5);
		
	}

}
