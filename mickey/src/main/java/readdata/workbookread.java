package readdata;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class workbookread {
	@Test
	public void readataTest() throws Exception {
		
		File src=new File("C:\\Users\\Abhilasha\\Desktop\\workbook.xlsx");
		
		FileInputStream var=new FileInputStream(src);
		
		XSSFWorkbook mic=new XSSFWorkbook(var);
		
		XSSFSheet sheet= mic.getSheetAt(0);
		
		int rcount=sheet.getLastRowNum();
		
		System.out.println("searched  found"+rcount);
		//int ccount=sheet.getLastCellNum();
		int i=0,c=0;
		String val=" ";
		String val2=" ";
		while(i<=rcount)
		{
			val=sheet.getRow(i).getCell(0).getStringCellValue();
			
			if(val.equals("Hello20")) {
				
		  val2=sheet.getRow(i).getCell(1).getStringCellValue();
				c++;
			}
			
			i++;
			
		}
		
		if(c>0)
		{
			System.out.println("searched  found===="+val2);
		}
		else
		{
			System.out.println("searched not found");
		}
		
		
		mic.close();
		
		// String val=sheet.getRow(3).getCell(1).getStringCellValue();
		 
		// System.out.println("printing value......"+val);
	}

}
