package baseClass;

import org.apache.poi.common.usermodel.Fill;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class dropDownCall extends dropdown {
	public static void main(String[] args) {
		browserLaunch();
		maximize();
		loadUrl("https://www.toolsqa.com/automation-practice-form/");
		WebElement aa = driver.findElement(By.id("continents"));
		fill(aa, "single select");
	}

}
