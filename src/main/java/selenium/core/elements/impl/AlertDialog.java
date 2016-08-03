package selenium.core.elements.impl;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import selenium.core.Session;
import selenium.core.elements.IAlertDialog;
import selenium.core.elements.IBlock;

/**
 * @author Wasiq B
 * @since 01-Aug-2016 9:22:56 pm
 */
public class AlertDialog extends Block implements IAlertDialog {
	private final Alert alert;

	/**
	 * @author Wasiq B
	 * @since 01-Aug-2016 9:22:56 pm
	 * @param session
	 */
	public AlertDialog (final Session session) {
		super (session);
		this.parent = null;
		this.alert = waitForAlert ();
	}

	/**
	 * @author Wasiq B
	 * @since 01-Aug-2016 9:25:53 pm
	 */
	public AlertDialog (final WebElement parent, final Session session) {
		this (session);
		this.parent = parent;
	}

	/**
	 * @author Wasiq B
	 * @since 01-Aug-2016 9:46:37 pm
	 * @return
	 */
	private Alert waitForAlert () {
		final WebDriverWait wait = new WebDriverWait (session ().driver (), 10);
		return wait.until ((Function <WebDriver, Alert>) d -> d.switchTo ().alert ());
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.core.elements.IAlertDialog#accept()
	 */
	@Override
	public <T extends IBlock> T accept () {
		this.alert.accept ();
		return session ().currentBlock (this.parent);
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.core.elements.IAlertDialog#decline()
	 */
	@Override
	public <T extends IBlock> T decline () {
		this.alert.dismiss ();
		return session ().currentBlock (this.parent);
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.core.elements.IAlertDialog#enterText(java.lang.String)
	 */
	@Override
	public IAlertDialog enterText (final String text) {
		this.alert.sendKeys (text);
		return session ().currentBlock (this.parent);
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.core.elements.IHasText#text()
	 */
	@Override
	public String text () {
		return this.alert.getText ();
	}
}