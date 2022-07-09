package readdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class readexcel {

	@Test
	public void readataTest() throws Exception {
		
		File src=new File("C:\\Users\\Abhilasha\\Documents\\readdata.xlsx");
		
		FileInputStream var=new FileInputStream(src);
		
		XSSFWorkbook mic=new XSSFWorkbook(var);
		
		XSSFSheet sheet= mic.getSheetAt(0);
		
		 String val=sheet.getRow(3).getCell(1).getStringCellValue();
		 
		 System.out.println("printing value......"+val);
	}
}
;