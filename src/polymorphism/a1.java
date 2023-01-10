package polymorphism;

public class a1 {
	
	public void login (String email, int pass) {
		
		System.out.println("navigate to home page");
	}
	
	public void login (int MobNo, int pass) {
		
		System.out.println("navigate to home page");
		
	}
	
	public static void main(String[] args) {
		
		a1 a=new a1();
		
		a.login("abc@gmail", 1234);
		

	}

}
