package WebDriver_Arch;

public class AmazonTest {
	
	static WebDriver driver;

	public static void main(String[] args) {

		//WebDriver driver = null;
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		//SafariDriver driver = new SafariDriver();
		//cross browser logic --- top casting
		String browser = "Chrome";
		
		if(browser.trim().equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
		else {
			System.out.println("Please pass the right browser.....");
		}
		
		
		driver.get("https://www.amazon.com");
		
		driver.findElement();
		driver.findElements();
		
		driver.sendKeys("emailId", "naveen@gmail.com");
		driver.sendKeys("password", "naveen@123");
		driver.click("loginbutton");
		driver.getText("welcome Naveen");
		driver.quit();
		
		
		

	}

}
