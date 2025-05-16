package seleniumBasics;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC02_TitleValidation {
	
	WebDriver driver;   //creating object for webdriver instance so we can access all methods from all the driver type classes
	String url = "http://10.81.64.170:83/Common/Login.aspx";
	
	
	
	@Before
	public void launchapp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kristopher.lea\\Downloads\\chromedriver-136\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);     //Launches application in chrome browser
		driver.manage().window().maximize();    // Maximizes the browser
		
		
		
	}
	

	@Test
	public void test() throws InterruptedException {
		String title = driver.getTitle();
		System.out.println("Validation in Console of title name: "+ title);
		
		
		Thread.sleep(3000);
		// Validate that tile is In Essence Bank
		//Assertion is needed - expectedresult, actualresult
		assertEquals("In Essence Bank", title);
	}
	
	@After
	public void closeapp() {
		driver.quit();
		//driver.close();
	}

}
