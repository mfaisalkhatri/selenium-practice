
package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
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
		final String env = System.getProperty ("env");
		if (env != null && env.equals ("ie")) {
			System.setProperty ("webdriver.ie.driver", System.getProperty ("user.dir") + "/driver/IEDriverServer.exe");
			driver = new InternetExplorerDriver ();
		}
		else if (env != null && env.equals ("chrome")) {
			System.setProperty ("webdriver.chrome.driver",
					System.getProperty ("user.dir") + "/driver/chromedriver.exe");
			driver = new ChromeDriver ();
		}
		else {
			FirefoxProfile ffprofile = new FirefoxProfile ();
			ffprofile.setPreference ("xpinstall.signatures.required", false);
			driver = new FirefoxDriver (ffprofile);
		}
		driver.get ("http://the-internet.herokuapp.com/nested_frames");
		driver.manage ().window ().maximize ();
		driver.manage ().timeouts ().implicitlyWait (10, TimeUnit.SECONDS);

		wait = new WebDriverWait (driver, 30);
	}

	@AfterSuite (alwaysRun = true)
	public void tearDown () {
		driver.quit ();
	}
}