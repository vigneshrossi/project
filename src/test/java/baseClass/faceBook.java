package baseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class faceBook extends libGlobal {
	public static void main(String[] args) {
		browserLaunch();
		maximize();
		loadurl("https://www.facebook.com/");
		getTitle();
		WebElement txtusername = driver.findElement(By.id("email"));
		fill(txtusername, "vignesh");
		getattribute(txtusername, "value");
		txtusername.getText();
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		fill(txtpass, "789456123");
		getattribute(txtpass, "value");
		txtpass.getText();
		
	    WebElement btnlogin = driver.findElement(By.id("loginbutton"));
	    click(btnlogin);
	    quitBrowser();
	    
	   
		
		
			
		
	}

}
