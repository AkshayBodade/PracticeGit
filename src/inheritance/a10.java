package inheritance;
        // hierarchical inheritance

class a8{
	
	void m1() {
		System.out.println("m1");
	}
}
class a9 extends a8{
	
	void m2() {
		System.out.println("m2");
		
	}
}
public class a10 extends a8{

	void m3() {
		System.out.println("m3");
		
	}
	
	public static void main(String[] args) {
		a10 a=new a10();
		
		a.m1();
		a.m2();
		a.m3();
		
		
			
			
		}

	}

}
