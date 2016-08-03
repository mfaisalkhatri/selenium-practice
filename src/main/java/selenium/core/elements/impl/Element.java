package selenium.core.elements.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium.core.Session;
import selenium.core.elements.IBlock;
import selenium.core.elements.IHasText;
import selenium.core.elements.ISelectable;

/**
 * @author Wasiq B
 * @since 31-Jul-2016 3:03:26 pm
 */
public class Element extends Block implements IHasText, ISelectable {
	protected IBlock parentBlock;

	/**
	 * @author Wasiq B
	 * @since 31-Jul-2016 3:04:57 pm
	 */
	public Element (final IBlock parent, final By locator) {
		this (parent.session (), parent.parent ().findElement (locator));
		this.parentBlock = parent;
	}

	/**
	 * @author Wasiq B
	 * @since 02-Aug-2016 7:37:13 pm
	 * @param parent
	 * @param tag
	 */
	public Element (final IBlock parent, final WebElement tag) {
		this (parent.session (), tag);
		this.parentBlock = parent;
	}

	/**
	 * @author Wasiq B
	 * @since 31-Jul-2016 3:03:26 pm
	 * @param session
	 */
	public Element (final Session session, final WebElement parent) {
		super (session);
		parent (parent);
	}

	/**
	 * @author Wasiq B
	 * @since 01-Aug-2016 9:48:53 pm
	 * @return
	 */
	public IBlock parentBlock () {
		return this.parentBlock;
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.core.elements.ISelectable#selected()
	 */
	@Override
	public boolean selected () {
		return parent ().isSelected ();
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.core.elements.IHasText#text()
	 */
	@Override
	public String text () {
		return parent ().getText ();
	}
}