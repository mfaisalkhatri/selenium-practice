package selenium.tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import selenium.driver.Browser;
import selenium.driver.StaticDriver;

/**
 * @author wasiq.bhamla
 * @since 19-Oct-2016 8:14:52 PM
 */
public class AbstractTest {
	/**
	 * @author wasiq.bhamla
	 * @since 19-Oct-2016 8:37:30 PM
	 */
	@AfterSuite
	public void cleanUpSuite () {
		StaticDriver.driver (Browser.CHROME).close ();
	}

	/**
	 * @author wasiq.bhamla
	 * @since 19-Oct-2016 8:37:34 PM
	 */
	@BeforeSuite
	public void setUpSuite () {
		StaticDriver.driver (Browser.CHROME).get ("http://www.demo.guru99.com/V4/");
	}
}
