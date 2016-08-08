package selenium.core.elements.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium.core.elements.IBlock;
import selenium.core.elements.ICheckBox;

/**
 * @author Wasiq B
 * @since 02-Aug-2016 7:18:52 pm
 */
public class CheckBox <T extends IBlock> extends Clickable <T> implements ICheckBox <T> {
	/**
	 * @author Wasiq B
	 * @since 02-Aug-2016 7:18:53 pm
	 * @param parent
	 * @param locator
	 */
	public CheckBox (final IBlock parent, final By locator) {
		super (parent, locator);
	}

	/**
	 * @author Wasiq B
	 * @since 02-Aug-2016 9:32:19 pm
	 * @param parent
	 * @param tag
	 */
	public CheckBox (final IBlock parent, final WebElement tag) {
		super (parent, tag);
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.core.elements.ICheckBox#check()
	 */
	@Override
	public T check () {
		if (!selected ()) toggle ();
		return session ().currentBlock (parent ());
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.core.elements.ICheckBox#toggle()
	 */
	@Override
	public T toggle () {
		parent ().click ();
		return session ().currentBlock (parent ());
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.core.elements.ICheckBox#uncheck()
	 */
	@Override
	public T uncheck () {
		if (selected ()) toggle ();
		return session ().currentBlock (parent ());
	}
}