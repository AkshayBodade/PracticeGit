package polymorphism;

class a2{
	
	public void grts () {
		
		System.out.println("hello");
		
	}
}

public class a3 extends a2 {
	
	public void grts () {
		
		System.out.println("hi");
	}

	public static void main(String[] args) {
		
   a3 a=new a3();
   a.grts();
		   
		   
	}

}
