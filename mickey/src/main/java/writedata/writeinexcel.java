package writedata;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class writeinexcel {

	@Test
	public void readataTest() throws Exception {
		
		//File src=new File("C:\\Users\\Abhilasha\\Documents\\readdata.xlsx");
		
		//FileInputStream var=new FileInputStream(src);
		
		XSSFWorkbook mic=new XSSFWorkbook();//loading 1st sheet in the workbook
		
		XSSFSheet sheet= mic.createSheet("User Master Template");
		
		for(int i=0;i<10;i++)
		{
			Row r=sheet.createRow(i);
			for (int j=0;j<5;j++)
			{
				Cell c=r.createCell(j);
				c.setCellValue("Abhilasha");
			}
		}
		//Row r=sheet.createRow(3);
		//Cell c=r.createCell(5);
		//c.setCellValue("naukri");
		File src=new File("C:\\Users\\Abhilasha\\Documents\\trial.xlsx");
		
		//sheet.getRow(1).getCell(2).setCellValue(Data);
		FileOutputStream fos=new FileOutputStream(src);
		mic.write(fos);
		mic.close();
	}

}
