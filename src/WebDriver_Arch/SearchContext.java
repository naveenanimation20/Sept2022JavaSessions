package WebDriver_Arch;

public interface SearchContext {

	
	public void findElement();
	
	public void findElements();

	
	default void test() {
		System.out.println("test");
	}
	
}
