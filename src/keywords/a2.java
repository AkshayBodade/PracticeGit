package keywords;

public class a2 {
	
	public void m1() {
		
		System.out.println("i am m1 method");
		
	}

	public void m2() {
		
		this.m1();
		
		
		System.out.println("i am m2 method");
		
	}
	
	public static void main(String[] args) {
		
		a2 b=new a2();
		
		b.m2();

	}

}
