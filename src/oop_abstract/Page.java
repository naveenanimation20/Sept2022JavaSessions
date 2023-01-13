package oop_abstract;

public abstract class Page {

	// can not create the object of abstract class

	// 1. only abstract methods ----> 100% abstraction
	// 2. only non abstract methods --> 0% abstraction
	// 3. abs + non abs ---> x% partial abstraction

	public Page() {
		System.out.println("Page const....");

	}

	public abstract void title();

	public abstract void url();

	public void pageTimeOut() {
		System.out.println("page time out -- 20 secs");
	}

	public final void displayLogo() {
		System.out.println("page -- logo");
	}

	public static void pageStyle() {
		System.out.println("page style");
		getPageTheme();
	}

	private static void getPageTheme() {
		System.out.println("get page theme");
	}

}
