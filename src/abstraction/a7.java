package abstraction;

interface inter1 {
	
	void m1(); 
	int a=10;
	


default void m2 () {
	
	System.out.println("m2");
	
	
  }
 static void m3() {
	 
	 System.out.println("m3");
	 
 
 }
 private void m4() {
	 
	 System.out.println("m4");
	 
 }
 
 }

public class a7 implements inter1 {
	
	public void m1() {
		
		System.out.println("m1");
		
	}


	public static void main(String[] args) {
		
		a7  a=new a7();
		
		a.m1();

	}

}
