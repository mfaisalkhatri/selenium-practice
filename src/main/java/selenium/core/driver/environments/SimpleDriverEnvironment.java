package selenium.core.driver.environments;

import java.lang.reflect.ParameterizedType;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import selenium.core.driver.IDriverEnvironment;
import selenium.core.utils.TimeSpan;

/**
 * @author Wasiq B
 * @since 26-Jul-2016 6:22:11 pm
 */
public class SimpleDriverEnvironment <TDriver extends WebDriver> implements IDriverEnvironment {
	protected TimeSpan timeToWait;

	/**
	 * @author Wasiq B
	 * @since 26-Jul-2016 6:22:11 pm
	 */
	public SimpleDriverEnvironment () {
		this (new TimeSpan (10, TimeUnit.SECONDS));
	}

	/**
	 * @author Wasiq B
	 * @since 26-Jul-2016 6:28:51 pm
	 * @param timeSpan
	 */
	public SimpleDriverEnvironment (final TimeSpan timeSpan) {
		this.timeToWait = timeSpan;
	}

	/**
	 * @author Wasiq B
	 * @since 27-Jul-2016 8:03:53 pm
	 * @return
	 */
	@SuppressWarnings ("unchecked")
	private Class <TDriver> getDriver () {
		final ParameterizedType type = (ParameterizedType) getClass ().getGenericSuperclass ();
		final Class <TDriver> cls = (Class <TDriver>) type.getActualTypeArguments () [0];
		return cls;
	}

	/**
	 * @author Wasiq B
	 * @param driver
	 * @since 27-Jul-2016 8:06:43 pm
	 */
	private void setupDriver (final WebDriver driver) {
		driver.manage ().window ().maximize ();
		driver.manage ().timeouts ().implicitlyWait (this.timeToWait.getTime (), this.timeToWait.getUnit ());
		driver.manage ().timeouts ().pageLoadTimeout (this.timeToWait.getTime (), this.timeToWait.getUnit ());
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.core.driver.IDriverEnvironment#createDriver()
	 */
	@Override
	public WebDriver createDriver () {
		final Class <TDriver> cls = getDriver ();
		TDriver driver = null;
		try {
			driver = cls.newInstance ();
			setupDriver (driver);
		}
		catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace ();
		}
		return driver;
	}
}