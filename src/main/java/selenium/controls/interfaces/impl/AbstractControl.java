package selenium.controls.interfaces.impl;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium.controls.interfaces.IContainer;
import selenium.controls.interfaces.IControl;

/**
 * @author wasiq.bhamla
 * @since Oct 18, 2016 3:46:55 PM
 */
public class AbstractControl <E extends IControl, T extends IContainer> extends AbstractContainer {
	protected final IContainer parentContainer;
	protected final Function <E, T> target;

	/**
	 * @author wasiq.bhamla
	 * @since 18-Oct-2016 9:12:58 PM
	 * @param parentContainer
	 * @param locator
	 */
	protected AbstractControl (final IContainer parentContainer, final By locator, final Function <E, T> target) {
		super (parentContainer.driver (), parentContainer.parent ().findElement (locator));
		this.parentContainer = parentContainer;
		this.target = target;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 18-Oct-2016 9:11:43 PM
	 * @param parentContainer
	 * @param parent
	 */
	protected AbstractControl (final IContainer parentContainer, final WebElement parent, final Function <E, T> target) {
		super (parentContainer.driver (), parent);
		this.parentContainer = parentContainer;
		this.target = target;
	}
}