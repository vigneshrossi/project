package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClass {
	static WebDriver driver;
	static Actions a;
	public static void broserLaunch() {
	try {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\mavenproject\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		
	} catch (Exception e) {
		e.getMessage();
	}

	}
	public static void maximize(String value) {
		try {
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(value);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void fill(WebElement s,WebElement d) {
		a =new Actions(driver);
		a.dragAndDrop(s, d).perform();
		a.contextClick().perform();

	}
	public static void go(WebElement s) {
		a =new Actions(driver);
		a.contextClick(s).perform();
		}
	}//actionclass
