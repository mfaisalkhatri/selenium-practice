package selenium.controls.interfaces.impl;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium.controls.interfaces.IClickable;
import selenium.controls.interfaces.IContainer;

/**
 * @author wasiq.bhamla
 * @since 18-Oct-2016 9:56:13 PM
 */
public class RadioButton <T extends IContainer> extends Option <T> {
	/**
	 * @author wasiq.bhamla
	 * @since 18-Oct-2016 9:56:13 PM
	 * @param parentContainer
	 * @param locator
	 */
	public RadioButton (final IContainer parentContainer, final By locator, Function <IClickable <T>, T> target) {
		super (parentContainer, locator, target);
	}

	/**
	 * @author wasiq.bhamla
	 * @since 18-Oct-2016 9:56:13 PM
	 * @param parentContainer
	 * @param parent
	 */
	public RadioButton (final IContainer parentContainer, final WebElement parent, Function <IClickable <T>, T> target) {
		super (parentContainer, parent, target);
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