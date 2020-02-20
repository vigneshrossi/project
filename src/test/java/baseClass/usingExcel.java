package baseClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class usingExcel extends libGlobal2 {
	public static void main(String[] args) throws IOException {
		browserLaunch();
		maximize();
		loadUrl("https://www.facebook.com/");
		WebElement txtusername = driver.findElement(By.id("email"));
		fill(txtusername, getData(0,0));
		WebElement txtpass = driver.findElement(By.id("pass"));
		fill(txtpass, getData(0,1));
		
		 WebElement btnlogin = driver.findElement(By.id("loginbutton"));
		    click(btnlogin);
		    quitBrowser();
	}

}
