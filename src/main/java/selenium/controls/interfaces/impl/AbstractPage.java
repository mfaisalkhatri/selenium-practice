package selenium.controls.interfaces.impl;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

/**
 * @author wasiq.bhamla
 * @since Oct 19, 2016 12:40:26 PM
 */
public class AbstractPage extends AbstractContainer {
	protected FluentWait <WebDriver> wait;

	/**
	 * @author wasiq.bhamla
	 * @since Oct 19, 2016 12:40:26 PM
	 */
	public AbstractPage () {
		this (10, TimeUnit.SECONDS);
	}

	/**
	 * @author wasiq.bhamla
	 * @since Oct 19, 2016 12:40:26 PM
	 * @param driver
	 */
	public AbstractPage (final long timeOut, final TimeUnit timeUnit) {
		super ();
		this.wait = new WebDriverWait (driver (), timeUnit.toSeconds (timeOut)).ignoring (StaleElementReferenceException.class).pollingEvery (1,
				timeUnit);
		this.parent = this.wait.until ((Function <WebDriver, WebElement>) d -> d.findElement (By.tagName ("body")));
	}
}