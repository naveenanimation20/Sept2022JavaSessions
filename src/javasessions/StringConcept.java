package javasessions;

public class StringConcept {

	public static void main(String[] args) {

		//String is a class - default class
		
		String s = "hello world";
		
		System.out.println(s);
		
		String s1 = "this is is my first java code";
		System.out.println(s1);
		
		String s2 = "100";
		System.out.println(s2+20);
		
		String x = "Hello";
		String y = "Selenium";
		
		int a = 100;
		int b = 200;
		
		double d1 = 12.33;
		double d2 = 22.33;
		
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);//HelloSelenium100200
		System.out.println(x+y+(a+b));//HelloSelenium300
		
		System.out.println(a+b+x+y+a+b);
		
		System.out.println(x+y+d1+d2);
		
		System.out.println(a+b+x+y+a+b+d1+d2);
		
		char c1 = 't';
		System.out.println(x+c1);
		
		System.out.println("hello selenium");
		
		System.out.println("the value of a is : " + a);
		System.out.println("the value of b is : " + b);
		System.out.println("the sum is : " + (a + b));
		
		System.out.println(x+" "+y);
		
		
		String n = null;
		
		

	}

}
