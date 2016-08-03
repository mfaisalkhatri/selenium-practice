package selenium.core.elements.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium.core.elements.IBlock;
import selenium.core.elements.IOption;

/**
 * @author Wasiq B
 * @since 02-Aug-2016 10:12:39 pm
 */
public class Option <T extends IBlock> extends Clickable <T> implements IOption <T> {
	/**
	 * @author Wasiq B
	 * @since 02-Aug-2016 10:13:00 pm
	 * @param parent
	 * @param locator
	 */
	public Option (final IBlock parent, final By locator) {
		super (parent, locator);
	}

	/**
	 * @author Wasiq B
	 * @since 02-Aug-2016 10:13:00 pm
	 * @param parent
	 * @param tag
	 */
	public Option (final IBlock parent, final WebElement tag) {
		super (parent, tag);
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.core.elements.impl.Clickable#click()
	 */
	@Override
	public T click () {
		this.parentBlock.parent ().click ();
		parent ().click ();
		return session ().currentBlock (parent ());
	}
}