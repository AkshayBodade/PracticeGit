package inheritance;

   // single inheritance 

class a1{
	void m1() {
		System.out.println("i am method m1");
	}
	
}

public class a2 extends a1{

	void m2() {
		
		System.out.println("i am method m2");
	}
	
	
	public static void main(String[] args) {
		
		a2 a=new a2();
		
		a.m2();
		a.m1();
		

	}

}
