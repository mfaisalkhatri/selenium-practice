package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * @author Wasiq B
 * @since 16-Jul-2016 4:40:21 pm
 */
public class BaseSeleniumTest {
	protected static WebDriver		driver;
	protected static WebDriverWait	wait;

	@BeforeSuite (alwaysRun = true)
	public void setup () {
		driver = new FirefoxDriver ();
		driver.navigate ().to ("http://the-internet.herokuapp.com/login");
		driver.manage ().window ().maximize ();
		driver.manage ().timeouts ().implicitlyWait (10, TimeUnit.SECONDS);

		wait = new WebDriverWait (driver, 30);
	}

	@AfterSuite (alwaysRun = true)
	public void tearDown () {
		driver.quit ();
	}
}