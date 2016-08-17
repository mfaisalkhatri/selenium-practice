package selenium.core.elements.impl;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import selenium.core.Session;
import selenium.core.utils.TimeSpan;

/**
 * @author Wasiq B
 * @since 06-Aug-2016 8:27:52 pm
 */
public class WebBlock extends Block {
	protected final WebDriverWait wait;

	/**
	 * @author Wasiq B
	 * @since 06-Aug-2016 8:28:08 pm
	 * @param session
	 */
	public WebBlock (final Session session) {
		this (session, new TimeSpan (30, TimeUnit.SECONDS));
	}

	/**
	 * @author Wasiq B
	 * @since 06-Aug-2016 8:31:14 pm
	 */
	public WebBlock (final Session session, final TimeSpan timeout) {
		super (session);
		this.wait = new WebDriverWait (session ().driver (), TimeUnit.SECONDS.toMillis (timeout.getTime ()));
		parent (this.wait.until ((Function <WebDriver, WebElement>) d -> d.findElement (By.tagName ("body"))));
	}
}