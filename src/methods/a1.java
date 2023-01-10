package methods;

public class a1 {

	public void m1 () {
		
		System.out.println("im m1 method");
	}
	static public void m2() {
		
		System.out.println("im m2 method");
	}
	public static void main(String[] args) {

		a1 a=new a1();
		
		a.m1();
		a.m2();
		a1.m2();
		
		
	}

}
