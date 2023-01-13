package javasessions;

public class Browser {

	// AC:
	// WAF:
	// name: launchBrowser
	// input param: browsername(String) --> chrome, firefox, IE, Safari
	// return: boolean

	public boolean launchBrowser(String browserName) {
		System.out.println("trying to launch browser: " + browserName);
		boolean flag = false;

		switch (browserName.toLowerCase().trim()) {//CHROME -->chrome --->chrome
		case "chrome":
			System.out.println("chrome is launched....");
			flag = true;
			break;
		case "firefox":
			System.out.println("firefox is launched....");
			flag = true;
			break;
		case "safari":
			System.out.println("safari is launched....");
			flag = true;
			break;
		case "ie":
			System.out.println("ie is launched....");
			flag = true;
			break;

		default:
			System.out.println("please pass the right browser...." + browserName);
			break;
		}

		return flag;
	}

	public static void main(String[] args) {
		Browser br = new Browser();
		boolean f1 = br.launchBrowser("  CHROME  ");
		System.out.println(f1);
	}

}
