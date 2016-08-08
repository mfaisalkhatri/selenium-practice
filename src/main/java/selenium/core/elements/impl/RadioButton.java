package selenium.core.elements.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium.core.elements.IBlock;

/**
 * @author wasiq.bhamla
 * @since Aug 4, 2016 4:47:51 PM
 */
public class RadioButton <T extends IBlock> extends Option <T> {
	/**
	 * @author wasiq.bhamla
	 * @since Aug 4, 2016 4:48:12 PM
	 * @param parent
	 * @param locator
	 */
	public RadioButton (IBlock parent, By locator) {
		super (parent, locator);
	}

	/**
	 * @author wasiq.bhamla
	 * @since Aug 4, 2016 4:48:12 PM
	 * @param parent
	 * @param tag
	 */
	public RadioButton (IBlock parent, WebElement tag) {
		super (parent, tag);
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.core.elements.impl.Element#text()
	 */
	@Override
	public String text () {
		By locator = By.cssSelector ("label[for=\"" + parent ().getAttribute ("id") + "\"]");
		return parentBlock ().parent ().findElement (locator).getText ();
	}
}