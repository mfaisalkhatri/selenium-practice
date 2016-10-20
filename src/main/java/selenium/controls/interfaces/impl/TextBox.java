package selenium.controls.interfaces.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium.controls.interfaces.IContainer;
import selenium.controls.interfaces.ITextField;

/**
 * @author wasiq.bhamla
 * @since 18-Oct-2016 8:42:47 PM
 */
public class TextBox extends AbstractControl implements ITextField {
	/**
	 * @author wasiq.bhamla
	 * @since 18-Oct-2016 8:42:47 PM
	 * @param parent
	 * @param locator
	 */
	public TextBox (final IContainer parent, final By locator) {
		super (parent, locator);
	}

	/**
	 * @author wasiq.bhamla
	 * @since 18-Oct-2016 9:20:49 PM
	 * @param parentContainer
	 * @param parent
	 */
	public TextBox (final IContainer parentContainer, final WebElement parent) {
		super (parentContainer, parent);
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.TextField#appendText(java.lang.String)
	 */
	@Override
	public void appendText (final String text) {
		for (final char c : text.toCharArray ()) {
			parent ().sendKeys (Character.toString (c));
		}
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.TextField#enterText(java.lang.String)
	 */
	@Override
	public void enterText (final String text) {
		parent ().clear ();
		appendText (text);
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.impl.AbstractContainer#text()
	 */
	@Override
	public String text () {
		return attribute ("value");
	}
}