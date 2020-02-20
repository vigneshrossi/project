package baseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class libGlobal2 {
	static WebDriver driver;
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
	public static void fill(WebElement ele, String value) {
		ele.sendKeys(value);
		}
	public static void click(WebElement ele) {
		ele.click();
		}
	public static void quitBrowser() {
		driver.close();
		}

	public static String getData(int row,int cell) throws IOException {
	File location = new File("C:\\Users\\home\\eclipse-workspace\\mavenproject\\ExcelSheet\\Data.xlsx");
	FileInputStream stream= new FileInputStream(location);
	Workbook w=new XSSFWorkbook(stream);
	Sheet s = w.getSheet("Sheet3");
	Row r = s.getRow(row);
	Cell c = r.getCell(cell);
	String value=null;
	
	int cellType = c.getCellType();
	if (cellType==1) {
	 value = c.getStringCellValue();	
	}
	else if (cellType==0) {
	if (DateUtil.isCellDateFormatted(c)) {
		Date dateCellValue = c.getDateCellValue();
		SimpleDateFormat sf=new SimpleDateFormat("MM-dd-yyyy");
		value=sf.format(dateCellValue);
		}	
	}
	else {
		double numericCellValue = c.getNumericCellValue();
		long l=(long) numericCellValue;
		 value= String.valueOf(l);
	}
	
	return value;
}
}// libglobal2
