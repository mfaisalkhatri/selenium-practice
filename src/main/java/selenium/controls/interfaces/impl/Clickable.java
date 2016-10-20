/**
 *
 */
package selenium.controls.interfaces.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium.controls.interfaces.IContainer;

/**
 * @author wasiq.bhamla
 * @since 18-Oct-2016 9:27:07 PM
 */
public class Clickable extends AbstractControl implements selenium.controls.interfaces.IClickable {

	/**
	 * @author wasiq.bhamla
	 * @since 18-Oct-2016 9:27:07 PM
	 * @param parentContainer
	 * @param locator
	 */
	public Clickable (final IContainer parentContainer, final By locator) {
		super (parentContainer, locator);
	}

	/**
	 * @author wasiq.bhamla
	 * @since 18-Oct-2016 9:27:07 PM
	 * @param parentContainer
	 * @param parent
	 */
	public Clickable (final IContainer parentContainer, final WebElement parent) {
		super (parentContainer, parent);
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.Clickable#click()
	 */
	@Override
	public void click () {
		parent ().click ();
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.Clickable#contextClick()
	 */
	@Override
	public void contextClick () {
		final Actions action = new Actions (driver ());
		action.contextClick (parent ()).build ().perform ();
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.Clickable#doubleClick()
	 */
	@Override
	public void doubleClick () {
		final Actions action = new Actions (driver ());
		action.moveToElement (parent ()).doubleClick ().build ().perform ();
	}
}