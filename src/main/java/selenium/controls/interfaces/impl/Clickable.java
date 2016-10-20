package selenium.controls.interfaces.impl;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium.controls.interfaces.IClickable;
import selenium.controls.interfaces.IContainer;

/**
 * @author wasiq.bhamla
 * @since 18-Oct-2016 9:27:07 PM
 */
public class Clickable <T extends IContainer> extends AbstractControl <IClickable <T>, T> implements IClickable <T> {
	/**
	 * @author wasiq.bhamla
	 * @since 18-Oct-2016 9:27:07 PM
	 * @param parentContainer
	 * @param locator
	 */
	public Clickable (final IContainer parentContainer, final By locator, final Function <IClickable <T>, T> target) {
		super (parentContainer, locator, target);
	}

	/**
	 * @author wasiq.bhamla
	 * @since 18-Oct-2016 9:27:07 PM
	 * @param parentContainer
	 * @param parent
	 */
	public Clickable (final IContainer parentContainer, final WebElement parent, final Function <IClickable <T>, T> target) {
		super (parentContainer, parent, target);
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.Clickable#click()
	 */
	@Override
	public T click () {
		parent ().click ();
		return this.target.apply (this);
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.Clickable#contextClick()
	 */
	@Override
	public T contextClick () {
		final Actions action = new Actions (driver ());
		action.contextClick (parent ()).build ().perform ();
		return this.target.apply (this);
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.Clickable#doubleClick()
	 */
	@Override
	public T doubleClick () {
		final Actions action = new Actions (driver ());
		action.moveToElement (parent ()).doubleClick ().build ().perform ();
		return this.target.apply (this);
	}
}