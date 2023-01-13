package oop_abstract;

public class AmazonApp {

	public static void main(String[] args) {

		//parent -- const....  ----> child const....
		//Run it ----> Parent const.....child const....
		
		LoginPage lp = new LoginPage();
		lp.title();
		lp.url();
		lp.displayLogo();
		lp.doLogin();

		Page.pageStyle();
		//LoginPage.pageStyle();
		
		//top casting:
		//child class object can be referred by parent abstract class ref variable
		Page p = new LoginPage();
		
		p.title();
		p.url();
		p.displayLogo();
		
		//
		//Page p1 = new Page();
		
		
	}

}
