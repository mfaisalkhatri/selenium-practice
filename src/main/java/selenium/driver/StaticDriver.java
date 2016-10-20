package selenium.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author wasiq.bhamla
 * @since Sep 23, 2016 2:07:19 PM
 */
public final class StaticDriver {
	private static WebDriver driver;

	/**
	 * @author wasiq.bhamla
	 * @since Sep 23, 2016 3:41:45 PM
	 * @return
	 */
	public static void close () {
		if (driver != null) {
			driver.quit ();
			driver = null;
		}
	}

	/**
	 * @author wasiq.bhamla
	 * @since Sep 23, 2016 2:09:37 PM
	 * @return the driver
	 */
	public static WebDriver driver (final Browser type) {
		if (driver == null) {
			switch (type) {
				case FIREFOX:
					driver = new FirefoxDriver ();
					break;
				case CHROME:
				default:
					final String dir = System.getProperty ("user.dir");
					final String path = dir + "/src/test/resources/mac_chromedriver.exe";
					System.setProperty ("webdriver.chrome.driver", path);
					driver = new ChromeDriver ();
					break;
			}
			driver.manage ().window ().maximize ();
			driver.manage ().timeouts ().pageLoadTimeout (30, TimeUnit.SECONDS);
			driver.manage ().timeouts ().implicitlyWait (10, TimeUnit.SECONDS);
		}
		return driver;
	}
}