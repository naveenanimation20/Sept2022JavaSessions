package WebDriver_Arch;

public class SafariDriver implements WebDriver {

	public SafariDriver() {
		System.out.println("Launch safari Browser.....");
	}

	@Override
	public void findElement() {
		System.out.println("find element");
	}

	@Override
	public void findElements() {
		System.out.println("find elements");

	}

	@Override
	public void get(String url) {
		System.out.println("launch url : " + url);
	}

	@Override
	public void click(String element) {
		System.out.println("clicking on element : " + element);
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("enter value in element: " + element + " : " + value);
	}

	@Override
	public String getText(String ele) {
		System.out.println("getting text of :" + ele);
		String str = "Amazon Header";
		return str;
	}

	@Override
	public boolean isDiplayed(String ele) {
		System.out.println("element is displayed : " + ele);
		return true;
	}

	@Override
	public void quit() {
		System.out.println("close browser");
	}

}
