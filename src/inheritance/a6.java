package inheritance;
// multilevel parent inheritance

class a4 {
	void m1 () {
		
		System.out.println("m1");
	}	
}
class a5 extends a4{
    void m2(){
		
		System.out.println("m2");
	}
}
public class a6 extends a5 {
	
	void m3() {
		
		System.out.println("m3");
		
	}
	public static void main(String[] args) {
		
		a6 a=new a6();
		
		a.m1();
		a.m2();
		a.m3();
		
		

	}

}
