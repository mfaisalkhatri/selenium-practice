package selenium.core.pages;

import org.openqa.selenium.By;

import selenium.core.Session;
import selenium.core.elements.IClickable;
import selenium.core.elements.impl.Clickable;
import selenium.core.elements.impl.WebBlock;

/**
 * @author wasiq.bhamla
 * @since 10-Aug-2016 7:22:29 PM
 */
public class FormSecurePage extends WebBlock {
	/**
	 * @author wasiq.bhamla
	 * @since 10-Aug-2016 7:22:29 PM
	 * @param session
	 */
	public FormSecurePage (Session session) {
		super (session);
	}

	/**
	 * @author wasiq.bhamla
	 * @since 10-Aug-2016 7:25:12 PM
	 * @return
	 */
	public IClickable <FormAuthPage> logout () {
		return new Clickable <FormAuthPage> (this, By.cssSelector (".button.secondary.radius"));
	}

	/**
	 * @author wasiq.bhamla
	 * @since 10-Aug-2016 7:23:30 PM
	 * @return
	 */
	public IClickable <FormAuthPage> message () {
		return new Clickable <FormAuthPage> (this, By.cssSelector ("#flash"));
	}
}
