package tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import tools.ChoseDriver;

public class BeforeAfterTest {
	static WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ChoseDriver cd = new ChoseDriver();
		driver = cd.runDriver("FireFox");
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.quit();
	}


}
