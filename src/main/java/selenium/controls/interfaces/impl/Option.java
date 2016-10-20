package selenium.controls.interfaces.impl;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium.controls.interfaces.IClickable;
import selenium.controls.interfaces.IContainer;
import selenium.controls.interfaces.IOption;

/**
 * @author wasiq.bhamla
 * @since 18-Oct-2016 9:36:32 PM
 */
public class Option <T extends IContainer> extends Clickable <T> implements IOption <T> {
	/**
	 * @author wasiq.bhamla
	 * @since 18-Oct-2016 9:36:32 PM
	 * @param parentContainer
	 * @param locator
	 */
	public Option (final IContainer parentContainer, final By locator, Function <IClickable <T>, T> target) {
		super (parentContainer, locator, target);
	}

	/**
	 * @author wasiq.bhamla
	 * @since 18-Oct-2016 9:36:32 PM
	 * @param parentContainer
	 * @param parent
	 */
	public Option (final IContainer parentContainer, final WebElement parent, Function <IClickable <T>, T> target) {
		super (parentContainer, parent, target);
	}
}