package kitty.kitty;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;  
import org.testng.annotations.AfterTest;  
import org.testng.annotations.BeforeTest;  
import org.testng.annotations.Test;  

@Test
public class automateme {
	
	
	  
	 String baseUrl = "https://www.javatpoint.com/";  
	 String driverPath = "C:\\Users\\Abhilasha\\Documents\\chromedriver//chromedriver.exe";   
	public WebDriver driver ;   
	public void test() {      
	// set the system property for Chrome driver      
	System.setProperty("webdriver.chrome.driver", driverPath);  
	// Create driver object for CHROME browser  
	driver = new ChromeDriver();  
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
	driver.manage().window().maximize();  
	driver.get(baseUrl);  
	// get the current URL of the page  
	String URL= driver.getCurrentUrl();  
	System.out.print(URL);  
	//get the title of the page  
	String title = driver.getTitle();                  
	System.out.println(title);  
	WebElement elementName = driver.findElement(By.xpath("//*[@id=\"link\"]/div/ul/li[6]/a"));
	elementName.click();
	}     
	@BeforeTest  
	public void beforeTest() {    
	System.out.println("before test");  
	}     
	@AfterTest  
	public void afterTest() {  
	driver.quit();  
	System.out.println("after test");  
	}         
	}  

