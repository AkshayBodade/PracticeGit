package abstraction;

interface inter2{
	
	default void m5() {
		
		System.out.println("m5");
		
	}
}

interface inter3{
	
	default void m6() {
		
		System.out.println("m6");
		
	}
	
}

public class a8 implements inter2, inter3 {
	
	public static void main(String[] args) {

		inter3 a=new a8();
		inter2 a=new i a8();
		
		a1.m5();
		a.m6();
		
		
	}

}
