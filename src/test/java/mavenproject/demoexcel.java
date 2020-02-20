package mavenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class demoexcel {
	public static void main(String[] args) throws IOException {
		//location
		File loc= new File("C:\\Users\\home\\eclipse-workspace\\mavenproject\\ExcelSheet\\Data.xlsx");
		//convert object
		FileInputStream stream= new FileInputStream(loc);
		//create workbook
		Workbook w=new XSSFWorkbook(stream);
		// sheet name
		Sheet s = w.getSheet("sheet1");
		//iterate
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			//each row
			Row r = s.getRow(i);
			//iterate
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				//each cell
				Cell c = r.getCell(j);
				System.out.println(c);
				
			}
			
		}
	}

}
