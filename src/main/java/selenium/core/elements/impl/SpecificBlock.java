package selenium.core.elements.impl;

import org.openqa.selenium.WebElement;

import selenium.core.Session;
import selenium.core.elements.ISpecificBlock;

/**
 * @author wasiq.bhamla
 * @since 10-Aug-2016 8:57:27 PM
 */
public class SpecificBlock extends Block implements ISpecificBlock {
	/**
	 * @author wasiq.bhamla
	 * @since 10-Aug-2016 8:57:27 PM
	 * @param session
	 */
	public SpecificBlock (Session session, WebElement parent) {
		super (session);
		parent (parent);
	}
}