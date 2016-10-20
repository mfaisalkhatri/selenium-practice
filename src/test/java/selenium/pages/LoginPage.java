package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.base.Function;

import selenium.controls.interfaces.IAlertDIalog;
import selenium.controls.interfaces.IClickable;
import selenium.controls.interfaces.ITextField;
import selenium.controls.interfaces.impl.AbstractPage;
import selenium.controls.interfaces.impl.AlertDialog;
import selenium.controls.interfaces.impl.Clickable;
import selenium.controls.interfaces.impl.TextBox;

/**
 * @author wasiq.bhamla
 * @since 24-Sep-2016 11:17:55 PM
 */
public class LoginPage extends AbstractPage {
	/**
	 * @author wasiq.bhamla
	 * @since 24-Sep-2016 11:17:55 PM
	 * @param parent
	 * @param locator
	 */
	public LoginPage () {
		super ();
		this.parent = this.wait.until ((Function <WebDriver, WebElement>) d -> d.findElement (By.name ("frmLogin")));
	}

	/**
	 * @author wasiq.bhamla
	 * @since 19-Oct-2016 8:39:44 PM
	 * @param userId
	 * @param password
	 */
	public void doLogin (final String userId, final String password) {
		userId ().enterText (userId);
		password ().enterText (password);
		login ().click ();
	}

	/**
	 * @author wasiq.bhamla
	 * @since 19-Oct-2016 8:31:42 PM
	 * @param userId
	 * @param password
	 * @return
	 */
	public void doUnsuccessfulLogin (final String userId, final String password) {
		doLogin (userId, password);

		final IAlertDIalog alert = new AlertDialog ();
		System.out.println (alert.text ());
		alert.accept ();
	}

	/**
	 * @author wasiq.bhamla
	 * @since 19-Oct-2016 8:27:14 PM
	 * @return
	 */
	public IClickable login () {
		return new Clickable (this, By.name ("btnLogin"));
	}

	/**
	 * @author wasiq.bhamla
	 * @since 19-Oct-2016 8:26:19 PM
	 * @return
	 */
	public ITextField password () {
		return new TextBox (this, By.name ("password"));
	}

	/**
	 * @author wasiq.bhamla
	 * @since 19-Oct-2016 8:28:07 PM
	 * @return
	 */
	public IClickable reset () {
		return new Clickable (this, By.name ("btnReset"));
	}

	/**
	 * @author wasiq.bhamla
	 * @since 19-Oct-2016 8:25:29 PM
	 * @return
	 */
	public ITextField userId () {
		return new TextBox (this, By.name ("uid"));
	}
}