package javasessions;

public class Students {

	// Method Overloading: Poly(many) + Morphism(forms): compile time / static

	// within the same class when we have multiple methods:
	// 1. with the same method name
	// 2. with different paramaters
	// 3. with different sequence of the parameter
	// 4. return type doesnt matter

	public void test() {
		System.out.println("0 param");
	}

	public void test(int i) {
		System.out.println("1 param " + i);
	}

	public void test(String i) {
		System.out.println("1 param");
	}

	public void test(int p, String i) {
		System.out.println("2 params");
	}

	public void test(String i, int p) {
		System.out.println("2 params " + i + p);
	}

	// ecomm: amazon:
	public void login() {
		System.out.println("login with no creds");
	}

	public void login(String username, String password) {
		System.out.println("login with right creds");
	}

	public void login(String username, String password, String role) {
		System.out.println("login with right creds");
	}

	public void login(String username, String password, int otp) {
		System.out.println("login with right creds");
	}

	// search:
	public void search() {

	}

	public void search(String productName) {

	}

	public void search(String productName, int price) {

	}

	public void search(String productName, int price, String color) {

	}

	// payment:
	public void doPayment(String upi) {

	}

	public void doPayment(String cc, int cvv) {

	}

	public void doPayment(String cc, int cvv, int otp) {

	}

	public void doPayment(String bankName, String password, String userId) {

	}

	// uber:
	public void booking() {

	}

	public void booking(String carType) {

	}

	public void booking(String carType, String stPoint, String endPoint) {

	}

	public void booking(String carType, String stPoint, String endPoint, int pssngers) {

	}

	//
	public void launchUrl(String url) {

	}

	public String launchUrl(String url, String queryParam) {
		String mainUrl = url + queryParam;
		return mainUrl;
	}

	public String launchUrl(String url, String queryParam, String browserName) {
		String mainUrl = url + queryParam;
		System.out.println("launch " + browserName);
		return mainUrl;
	}

	// can we overload static methods: YES
	public static void getInfo(String name) {
		
	}

	public static void getInfo(String name, String deptName) {

	}

	public static void main(String[] args) {

		Students st = new Students();
		st.test(10);
		st.test("tom", 25);
		
		Students.getInfo("naveen");

	}

}
