package javasessions;

public class ConditionalStatements {

	public static void main(String[] args) {

//		System.out.println(10==20);
//		
//		int i = 20;
//		int j = 20;
//		
//		if(i==j) {
//			System.out.println("pass");
//		}
//		else {
//			System.out.println("fail");
//		}
//		
//		//
//		if(true) {
//			System.out.println("Hi");
//		}
//		else { //dead code
//			System.out.println("bye");
//		}
//		
//		//
//		boolean flag = false;
//		if(flag) {
//			System.out.println("Hello");
//		}
//		else {
//			System.out.println("Bye!!");
//		}
//		
//		//nested if
//		int marks = 100;
//		if(marks >= 90) {
//				if(marks>=95) {
//					System.out.println("GRADE A++");
//						if(marks == 100) {
//							System.out.println("eligible for schloarship");
//						}
//						else {
//							System.out.println("not eligible for schloarship");
//						}
//				}
//				else {
//					System.out.println("GRADE A");
//
//				}
//		}
//		else {
//			System.out.println("GRADE B");
//		}
//		
//		
//		//
//		String s1 = "Selenium";
//		String s2 = "selenium";
//		if(s1.equals(s2)) {
//			System.out.println("pass");
//		}
//		else {
//			System.out.println("fail");
//		}
//		
//		//browser -- chrome, firefox, edge, IE
//		
//		String browser = "chrome";
//		
//		if(browser.equals("chrome")) {
//			System.out.println("launch chrome");
//		}
//		if(browser.equals("firefox")) {
//			System.out.println("launch firefox");
//		}
//		if(browser.equals("edge")) {
//			System.out.println("launch edge");
//		}
//		if(browser.equals("ie")) {
//			System.out.println("launch ie");
//		}
//		else {
//			System.out.println("please pass the right browser...." + browser);
//		}
//		
//		System.out.println("---------------------");
//		//
//		String br = "chrome";
//		if(br.equals("chrome")) {
//			System.out.println("launch chrome");
//		}
//		else if(br.equals("firefox")) {
//			System.out.println("launch firefox");
//		}
//		else if(br.equals("edge")) {
//			System.out.println("launch edge");
//		}
//		else if(br.equals("ie")) {
//			System.out.println("launch ie");
//		}
//		else {
//			System.out.println("please pass the right browser...." + br);
//		}
//		
//		
//		char t = 'a';//97
//		if(t == 97) {
//			System.out.println("PASS");
//		}
//		else {
//			System.out.println("FAIL");
//		}
//		
//		//
		float h1= 1.12f;//001010101001
		float h2= 22.1f;//01010111101010 ---> 010101010101010010100101001
		float h3 = h1+h2;
		System.out.println(h1+h2);
		System.out.println(h3);

//		
//		
//		//a-z: 97 to 122
//		for(char p='a'; p<='z'; p++) {
//			System.out.println(p+0);
//		}
		
		//
		short s1 = 20;
		short s2 = 2000;
//		short s3 = 32768;
		short s4 = 32767;
		short s5 = 32767;
		long mul3 = s4*s5*s1;			
		System.out.println(mul3);	//-1310700

		
		long mul4 = s4 * s5;	
		long mul5 = mul4 * s1;
		System.out.println(mul5);	//21473525780
		
		
		
	}

}
