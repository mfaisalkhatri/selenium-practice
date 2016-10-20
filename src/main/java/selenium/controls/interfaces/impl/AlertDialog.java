package selenium.controls.interfaces.impl;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import selenium.controls.interfaces.IAlertDIalog;

/**
 * @author wasiq.bhamla
 * @since 18-Oct-2016 8:32:45 PM
 */
public class AlertDialog extends AbstractContainer implements IAlertDIalog {
	private final Alert alert;

	/**
	 * @author wasiq.bhamla
	 * @since 18-Oct-2016 8:32:45 PM
	 */
	public AlertDialog () {
		super ();
		this.parent = null;
		this.alert = waitForAlert ();
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.AlertDIalog#accept()
	 */
	@Override
	public void accept () {
		this.alert.accept ();
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.AlertDIalog#enterText(java.lang.String)
	 */
	@Override
	public void enterText (final String text) {
		for (final char c : text.toCharArray ()) {
			this.alert.sendKeys (Character.toString (c));
		}
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.AlertDIalog#reject()
	 */
	@Override
	public void reject () {
		this.alert.dismiss ();
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.impl.AbstractContainer#text()
	 */
	@Override
	public String text () {
		return this.alert.getText ();
	}

	/**
	 * @author wasiq.bhamla
	 * @since 18-Oct-2016 8:34:07 PM
	 * @return
	 */
	private Alert waitForAlert () {
		final WebDriverWait wait = new WebDriverWait (this.driver, 30);
		return wait.until ((Function <WebDriver, Alert>) d -> d.switchTo ().alert ());
	}
}