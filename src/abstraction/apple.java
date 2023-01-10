package abstraction;

abstract class fruit{
	
	abstract void test ();
	
}
class mango extends Fruits {
	
	System.out.println("sour");
	
}


public class apple extends fruit {
	
	public void test () {
		
		System.out.println("sweet");
	}
}
	

	public static void main(String[] args) {

		fruit apple =new apple ();
		fruit mango =new mango ();
		apple.taste();
	}

}
