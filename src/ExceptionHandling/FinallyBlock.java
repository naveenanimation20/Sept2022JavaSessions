package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {

		System.out.println("A");

		try {
			int i = 9 / 0;
		} 
		
		catch (ArithmeticException e) {
			System.out.println("AE is coming....");
			e.printStackTrace();
		}
		
		
		finally {
			System.out.println("logout");
		}
		
		int p = 100;
		int r = 200;
		System.out.println(p+r);

	}

}
