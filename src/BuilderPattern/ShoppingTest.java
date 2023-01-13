package BuilderPattern;

public class ShoppingTest {

	public static void main(String[] args) {

		
		EcommApplication obj = new EcommApplication();
		
		obj.login("naveen@gmail.com", "naveen123")
				.search("iMac")
					.addToCart("iMac")
						.payment("1234 4444 4444 3232", 900)
							.getOrderId()
								.logout();
		
									
			System.out.println("-------");				
		//
		obj.login("naveen@gmail.com", "naveen123")
				.search("iPad", "Silver")
						.addToCart("iPad")
							.logout();
		System.out.println("-------");				

		
		//
		obj.login("naveen@gmail.com", "naveen123")
					.search("BT")
						.logout();
		
		//
		System.out.println("-------");	
		obj.login("naveen@gmail.com", "naveen123")
				.logout();
		
		//
		obj.login("naveen@gmail.com", "naveen123");
		System.out.println(obj.str);

		
		//
		obj.logout();

	}

}
