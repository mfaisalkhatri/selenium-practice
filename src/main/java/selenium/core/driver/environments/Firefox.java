package selenium.core.driver.environments;

import org.openqa.selenium.firefox.FirefoxDriver;

import selenium.core.utils.TimeSpan;

/**
 * @author Wasiq B
 * @since 27-Jul-2016 7:28:00 pm
 */
public class Firefox extends SimpleDriverEnvironment <FirefoxDriver> {
	/**
	 * @author Wasiq B
	 * @since 27-Jul-2016 7:28:20 pm
	 */
	public Firefox () {
		super ();
	}

	/**
	 * @author Wasiq B
	 * @since 27-Jul-2016 7:28:20 pm
	 * @param timeSpan
	 */
	public Firefox (final TimeSpan timeSpan) {
		super (timeSpan);
	}
}