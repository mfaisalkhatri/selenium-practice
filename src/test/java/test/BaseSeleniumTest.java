package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * @author Wasiq B
 * @since 16-Jul-2016 4:40:21 pm
 */
public class BaseSeleniumTest {
	protected static WebDriver driver;

	@BeforeSuite (alwaysRun = true)
	public void setup () {
		driver = new FirefoxDriver ();
		driver.navigate ().to ("http://demoqa.com/");
		driver.manage ().window ().maximize ();
	}

	@AfterSuite (alwaysRun = true)
	public void tearDown () {
		driver.quit ();
	}
}