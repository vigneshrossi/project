package task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class snapDeal {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\home\\eclipse-workspace\\mavenproject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebElement txtsearch = driver.findElement(By.id("inputValEnter"));
		txtsearch.sendKeys("iphone");
		WebElement btnsearch = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		btnsearch.click();
		List<WebElement> a = driver.findElements(By.xpath("//p[@class='product-title']"));
		for (WebElement x : a) {
			String text1 = x.getText();
			System.out.println(text1);
			System.out.println("???????????????????????????????????????????");
			
		}
	}

}
