package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class libGlobal {
	static WebDriver driver;
	public  static void browserLaunch() {
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\home\\eclipse-workspace\\mavenproject\\driver\\chromedriver.exe");
			 driver=new ChromeDriver();
			System.out.println("Browser launch successfully");
		} catch (Exception e) {
			e.getMessage();
			System.out.println("Browser launch unsucessfully");
		}
		}
	public static void maximize() {
		try {
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			System.out.println("Window maximum is done");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("window maximum is not done");
		}
		}
	public static void loadurl(String value) {
		driver.get(value);
		}
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		}
	public static void fill(WebElement ele,String value) {
	ele.sendKeys(value);	
	}
	public static void click(WebElement ele) {
	ele.click();	
	}
	public static void getattribute(WebElement ele,String value) {
		String attribute = ele.getAttribute(value);
		System.out.println(attribute);
		}
	public static void getText(WebElement ele) {
		String text = ele.getText();
		System.out.println(text);
		}
	public static void quitBrowser() {
		driver.close();

	}
	
}//libglobal
