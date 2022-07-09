package com.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class annotation {
	
	String driverPath = "C:\\Users\\Abhilasha\\Documents\\chromedriver\\chromedriver.exe";  
	public WebDriver driver;
	@Test
	@Parameters({"url","search"})
	public void method( String url,String search)
	{
		driver = new ChromeDriver();  
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
		driver.manage().window().maximize();  
		driver.get(url);  
		driver.findElement(By.cssSelector("input[class=\"gLFyf gsfi\"]")).sendKeys ("search");
		
		
	}
	
@Test

public void method2()
{
	
	System.out.println("Checking test annotation in second method");
	}





@BeforeMethod

public void before() {
	System.out.println("Checking test annotation in before method");
	
}
@AfterMethod

public void after()
{
	System.out.println("Checking test annotation in after method");
}
}
