package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {

		
		String data = null;//reading from excel/prop
		
		if(data == null) {
			
			try {
				throw new Exception("DATANOTFOUNDEXCEPTION");
			}
			catch(Exception e) {
				System.out.println("data exception is coming...");
				e.printStackTrace();
			}
		}
		
		
		
		System.out.println("logout....");
	}

}
