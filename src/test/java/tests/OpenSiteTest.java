package tests;

import static org.junit.Assert.*;

//import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OpenSiteTest {
	
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		//fail("Not yet implemented");
		driver.get("https://www.uol.com.br/");
		Thread.sleep(5000);
		String curentUrl = driver.getCurrentUrl();
		driver.manage().window().maximize();
		System.out.println("Current URL: " + curentUrl);
		driver.navigate().refresh();
		String title = driver.getTitle();
		assertTrue("Titulo da página difere do esperado", driver.getTitle().contentEquals("UOL - Seu universo online")); 
		System.out.println("Title: " + title);
		String window1 = driver.getWindowHandle();
		System.out.println("Window: " + window1);

		
		
	}

}
