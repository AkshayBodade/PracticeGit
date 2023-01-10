package abstraction;

abstract class a1{
	
	public void m1() {
		
		System.out.println("m1");
		
	}
	abstract void m2();
}

public class a2 extends a1{
	
	public void m2(){
		
		System.out.println("m2");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		a2 a=new a2 ();
		
		a.m1();
		a.m2();
		
		
	}

}
