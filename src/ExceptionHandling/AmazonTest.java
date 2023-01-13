package ExceptionHandling;

public class AmazonTest {

	public static void main(String[] args) {

		String browser = "opera";
		
		if(browser.equals("chrome")) {
			System.out.println("launch chrome");
		}
		else if(browser.equals("ff")) {
			System.out.println("launch ff");
		}
		else if(browser.equals("safari")) {
			System.out.println("launch safari");
		}
		else {
			System.out.println("pls pass the right browser");
			throw new MyException("No browser exception");
		}
		
		
		
	}

}
