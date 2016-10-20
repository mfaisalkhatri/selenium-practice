package selenium.controls.interfaces.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium.controls.interfaces.IContainer;

/**
 * @author wasiq.bhamla
 * @since 18-Oct-2016 9:36:32 PM
 */
public class Option extends Clickable implements selenium.controls.interfaces.IOption {
	/**
	 * @author wasiq.bhamla
	 * @since 18-Oct-2016 9:36:32 PM
	 * @param parentContainer
	 * @param locator
	 */
	public Option (final IContainer parentContainer, final By locator) {
		super (parentContainer, locator);
	}

	/**
	 * @author wasiq.bhamla
	 * @since 18-Oct-2016 9:36:32 PM
	 * @param parentContainer
	 * @param parent
	 */
	public Option (final IContainer parentContainer, final WebElement parent) {
		super (parentContainer, parent);
	}
}