package abstraction;

interface inter1{
	
	void m1(); // by default as public abstract 
	
	int a= 10; // by default as public static final
	
	// java 8th version
	
	default void m2() {
	
	}
	static void m3() {  // by default consider as public 

	System.out.println("m3");
	
}
     // java 9th version
	
	private void m4() {
		
		System.out.println("m4");
		
	}

public class a5 implements inter1 {
	public void m1() {
		
		System.out.println("m1");
		
		
	}
}

	public static void main(String[] args) {

		a5 a=new a5();
		
		a.m1();
	}

}
