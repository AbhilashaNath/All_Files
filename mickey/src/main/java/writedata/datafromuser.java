package writedata;

import java.util.Scanner;

import org.testng.annotations.Test;

public class datafromuser {
	
	  @Test
	public void excelData() throws Exception
	{
		Scanner sc=new Scanner (System.in);
		
		System.out.println("enter a value");
		String check=sc.next();
		System.out.println("entered a value"+check);
		writeinexcel ob=new writeinexcel();
		//ob.readataTest(check);
		
		
	}

}
