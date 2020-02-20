package baseClass;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class actioCall extends actionClass{
	public static void main(String[] args) {
		broserLaunch();
		maximize("http://demo.guru99.com/test/drag_drop.html");
	WebElement a  = driver.findElement(By.xpath(("//li[@class='block14 ui-draggable']")));
	WebElement b  = driver.findElement(By.xpath(("//li[@class='placeholder']")));
	fill(a, b);	
	WebElement c = driver.findElement(By.xpath("//li[@class='sel4 ui-draggable']"));
	go(c);
	}

}
