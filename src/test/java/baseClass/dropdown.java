package baseClass;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	static WebDriver driver;
	static Select s;
	static Scanner s1;
	public static void browserLaunch() {
		try {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\mavenproject\\driver\\chromedriver.exe");
	 driver=new ChromeDriver();
	System.out.println("Browser is launch successfully");
		} catch (Exception e) {
			e.getMessage();
		}}
	
	public static void maximize() {
		try {
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			System.out.println("window maximize done");
		} catch (Exception e) {
		e.printStackTrace();	
		}}
	public static void loadUrl(String value) {
		driver.get(value);
}
	public static void scanner() {
		 s1=new Scanner(System.in);
}
	public static void fill(WebElement ele,String name) {
	if (name.equals("single select")) {
		s=new Select(ele);
		s.selectByIndex(2);
	} 
		
		
		
	}

	}



