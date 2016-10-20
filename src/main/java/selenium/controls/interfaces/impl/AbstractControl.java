package selenium.controls.interfaces.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium.controls.interfaces.IContainer;

/**
 * @author wasiq.bhamla
 * @since Oct 18, 2016 3:46:55 PM
 */
public class AbstractControl extends AbstractContainer {
	protected final IContainer parentContainer;

	/**
	 * @author wasiq.bhamla
	 * @since 18-Oct-2016 9:12:58 PM
	 * @param parentContainer
	 * @param locator
	 */
	protected AbstractControl (final IContainer parentContainer, final By locator) {
		super (parentContainer.driver (), parentContainer.parent ().findElement (locator));
		this.parentContainer = parentContainer;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 18-Oct-2016 9:11:43 PM
	 * @param parentContainer
	 * @param parent
	 */
	protected AbstractControl (final IContainer parentContainer, final WebElement parent) {
		super (parentContainer.driver (), parent);
		this.parentContainer = parentContainer;
	}
}