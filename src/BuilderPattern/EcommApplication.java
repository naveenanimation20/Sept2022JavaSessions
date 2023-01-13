package BuilderPattern;

public class EcommApplication {
	public String str;

	public EcommApplication login(String un, String pwd) {
		System.out.println("login with : " + un + ":" + pwd);
		String str = "welcome naveen";
		this.str = str;
		return this;
	}

	public EcommApplication search(String productName) {
		System.out.println("search product: " + productName);
		return this;
	}

	public EcommApplication search(String productName, String color) {
		System.out.println("search product: " + productName + " :  " + color);
		return this;
	}

	public EcommApplication addToCart(String productName) {
		System.out.println("Add to Cart: " + productName);
		return this;
	}

	public EcommApplication payment(String upi) {
		System.out.println("making payment via upi: " + upi);
		return this;
	}

	public EcommApplication payment(String cc, int cvv) {
		System.out.println("making payment via CC: " + cc + " : " + cvv);
		return this;
	}

	public EcommApplication getOrderId() {
		System.out.println("getOrderId : " + 1234);
		return this;
	}

	public EcommApplication logout() {
		System.out.println("logout");
		return this;
	}

}
