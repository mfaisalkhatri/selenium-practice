package selenium.controls.interfaces.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium.controls.interfaces.IContainer;

/**
 * @author wasiq.bhamla
 * @since 18-Oct-2016 9:56:13 PM
 */
public class RadioButton extends Option {
	/**
	 * @author wasiq.bhamla
	 * @since 18-Oct-2016 9:56:13 PM
	 * @param parentContainer
	 * @param locator
	 */
	public RadioButton (final IContainer parentContainer, final By locator) {
		super (parentContainer, locator);
	}

	/**
	 * @author wasiq.bhamla
	 * @since 18-Oct-2016 9:56:13 PM
	 * @param parentContainer
	 * @param parent
	 */
	public RadioButton (final IContainer parentContainer, final WebElement parent) {
		super (parentContainer, parent);
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.impl.AbstractContainer#text()
	 */
	@Override
	public String text () {
		WebElement radio = this.parentContainer.parent ().findElement (By.cssSelector ("label[for=\"" + attribute ("id") + "\"]"));
		return radio.getText ();
	}
}