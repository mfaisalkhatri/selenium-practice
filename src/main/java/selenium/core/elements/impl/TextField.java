package selenium.core.elements.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium.core.Key;
import selenium.core.elements.IBlock;
import selenium.core.elements.ITextField;

/**
 * @author Wasiq B
 * @since 02-Aug-2016 7:33:06 pm
 */
public class TextField <T extends IBlock> extends Clickable <T> implements ITextField <T> {
	/**
	 * @author Wasiq B
	 * @since 02-Aug-2016 7:33:32 pm
	 * @param parent
	 * @param locator
	 */
	public TextField (final IBlock parent, final By locator) {
		super (parent, locator);
	}

	/**
	 * @author Wasiq B
	 * @since 02-Aug-2016 7:38:49 pm
	 * @param parent
	 * @param tag
	 */
	public TextField (final IBlock parent, final WebElement tag) {
		super (parent, tag);
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.core.elements.ITextField#appendText(java.lang.String)
	 */
	@Override
	public T appendText (final String text, Class <T> target) {
		final char [] chrs = text.toCharArray ();
		for (final char c : chrs) {
			parent ().sendKeys (Character.toString (c));
		}
		return session ().current (parent (), target).currentBlock ();
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.core.elements.ITextField#enterText(java.lang.String)
	 */
	@Override
	public T enterText (final String text, Class <T> target) {
		parent ().clear ();
		return appendText (text, target);
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.core.elements.ITextField#press(selenium.core.Key)
	 */
	@Override
	public T press (final Key key, Class <T> target) {
		parent ().sendKeys (key.value ());
		return session ().current (parent (), target).currentBlock ();
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.core.elements.impl.Element#text()
	 */
	@Override
	public String text () {
		return parent ().getAttribute ("value");
	}
}