package mavenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class facebookdemo {
	public static void main(String[] args) throws IOException {
		//location
				File loc= new File("C:\\Users\\home\\eclipse-workspace\\mavenproject\\ExcelSheet\\Data.xlsx");
				//convert object
				FileInputStream stream= new FileInputStream(loc);
				//create workbook
				Workbook w=new XSSFWorkbook(stream);
				// sheet name
				Sheet s = w.getSheet("sheet2");
				Row r = s.getRow(1);
				Cell c = r.getCell(1);
				System.out.println(c);
		//to string date and number
				int celltype = c.getCellType();
				System.out.println(celltype);
				
				if (celltype==1) {
			 String stringCellValue = c.getStringCellValue();
			 System.out.println(stringCellValue);
			 }
				
				else if (celltype==0) {
					if(DateUtil.isCellDateFormatted(c)) {
					Date dateCellValue = c.getDateCellValue();
					System.out.println(dateCellValue);
					SimpleDateFormat sf=new SimpleDateFormat("MM/dd/yyyy");
					String s1 = sf.format(dateCellValue);
					System.out.println(s1);
					}
				else
				{
					double numericCellValue = c.getNumericCellValue();
					System.out.println(numericCellValue);
					long l=(long)numericCellValue;
					String valueOf = String.valueOf(l);
					System.out.println(valueOf);
				}
	}

}
}