package first.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ClassOne {
	
	@Test
	public void testNGdemo() {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");

//		WebDriver driver = new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.walmart.com/");
		
		
		driver.close();
		
		
	}	
	
	@Test
	public void secondTEst() {
		
		System.out.println("this is just a dummy ");
		
		System.out.println("Testing Web HOok option");
	}
	
}
