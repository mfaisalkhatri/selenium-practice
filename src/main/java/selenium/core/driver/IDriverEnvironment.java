package selenium.core.driver;

import org.openqa.selenium.WebDriver;

/**
 * @author Wasiq B
 * @since 26-Jul-2016 6:16:47 pm
 */
public interface IDriverEnvironment {
	/**
	 * @author Wasiq B
	 * @since 26-Jul-2016 6:17:09 pm
	 * @return
	 */
	WebDriver createDriver ();
}
