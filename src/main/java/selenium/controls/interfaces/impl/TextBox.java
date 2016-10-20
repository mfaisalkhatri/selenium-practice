package selenium.controls.interfaces.impl;

import java.util.Objects;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium.controls.interfaces.IContainer;
import selenium.controls.interfaces.ITextField;

/**
 * @author wasiq.bhamla
 * @since 18-Oct-2016 8:42:47 PM
 */
public class TextBox <T extends IContainer> extends AbstractControl <ITextField <T>, T> implements ITextField <T> {
	/**
	 * @author wasiq.bhamla
	 * @since 18-Oct-2016 8:42:47 PM
	 * @param parent
	 * @param locator
	 */
	public TextBox (final IContainer parent, final By locator, final Function <ITextField <T>, T> target) {
		super (parent, locator, target);
	}

	/**
	 * @author wasiq.bhamla
	 * @since 18-Oct-2016 9:20:49 PM
	 * @param parentContainer
	 * @param parent
	 */
	public TextBox (final IContainer parentContainer, final WebElement parent, final Function <ITextField <T>, T> target) {
		super (parentContainer, parent, target);
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.TextField#appendText(java.lang.String)
	 */
	@Override
	public T appendText (final String text) {
		T res = null;
		for (final char c : text.toCharArray ())
			res = sendKeys (Character.toString (c));
		return res;
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.TextField#enterText(java.lang.String)
	 */
	@Override
	public T enterText (final String text) {
		parent ().clear ();
		return appendText (text);
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.ITextField#sendKeys(java.lang.String)
	 */
	@Override
	public T sendKeys (final String text) {
		Objects.requireNonNull (this.target);
		parent ().sendKeys (text);
		return this.target.apply (this);
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