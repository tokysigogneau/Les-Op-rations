
public class Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static void add ( int a, int b) {
		System.out.println(a + b);
		
	}
	
	static void sub ( int a, int b) {
		System.out.println(a - b);
		
	}
	static void multiple ( int a, int b) {
		System.out.println(a * b);
		
	}
	
	static void div ( int a, int b) {
		if (b != 0) {
			System.out.println(a / b);
		}
		else {
			System.out.println("On ne peut pas diviser par 0");
		}

		
	}

}
