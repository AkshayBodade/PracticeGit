package TypeCasting;

class parent{
	
	void m1() {
		
		System.out.println("m1");
	}
}

class child extends parent{
	
	void m2() {
		
		System.out.println("m2");
	}
}

public class a3 {

	public static void main(String[] args) {
		
		parent a=new child ();
		
		//int a=10;
		
		child c=(child)a;
		
		//byte b=(byte)a;
		
	//	a.m1();
	//	a.m2();
		
		c.m1();
		c.m2();
		
	// TODO Auto-generated method stub

	}

}
