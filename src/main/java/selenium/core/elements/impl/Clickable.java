package selenium.core.elements.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium.core.elements.IBlock;
import selenium.core.elements.IDoubleClickable;

/**
 * @author Wasiq B
 * @since 01-Aug-2016 8:59:19 pm
 */
public class Clickable <T extends IBlock> extends Element implements IDoubleClickable <T> {
	/**
	 * @author Wasiq B
	 * @since 01-Aug-2016 8:59:19 pm
	 * @param parent
	 * @param locator
	 */
	public Clickable (final IBlock parent, final By locator) {
		super (parent, locator);
	}

	/**
	 * @author Wasiq B
	 * @since 02-Aug-2016 7:38:26 pm
	 * @param parent
	 * @param tag
	 */
	public Clickable (final IBlock parent, final WebElement tag) {
		super (parent, tag);
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.core.elements.IClickable#click()
	 */
	@Override
	public T click () {
		parent ().click ();
		return session ().currentBlock ();
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.core.elements.IDoubleClickable#doubleClick()
	 */
	@Override
	public T doubleClick () {
		new Actions (session ().driver ()).moveToElement (parent ()).doubleClick ().build ().perform ();
		return session ().currentBlock ();
	}
}