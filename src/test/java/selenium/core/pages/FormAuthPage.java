package selenium.core.pages;

import javax.naming.OperationNotSupportedException;

import org.openqa.selenium.By;

import selenium.core.Session;
import selenium.core.elements.IBlock;
import selenium.core.elements.IClickable;
import selenium.core.elements.ITextField;
import selenium.core.elements.impl.Clickable;
import selenium.core.elements.impl.TextField;
import selenium.core.elements.impl.WebBlock;

/**
 * @author wasiq.bhamla
 * @since 10-Aug-2016 7:10:32 PM
 */
public class FormAuthPage extends WebBlock {
	/**
	 * @author wasiq.bhamla
	 * @since 10-Aug-2016 7:10:40 PM
	 * @param session
	 */
	public FormAuthPage (Session session) {
		super (session);
		try {
			parent (findElement (By.cssSelector ("#login")));
		}
		catch (OperationNotSupportedException e) {
			e.printStackTrace ();
		}
	}

	/**
	 * @author wasiq.bhamla
	 * @since 10-Aug-2016 7:13:57 PM
	 * @return
	 */
	public ITextField <FormAuthPage> userName () {
		return new TextField <FormAuthPage> (this, By.cssSelector ("#username"));
	}

	/**
	 * @author wasiq.bhamla
	 * @since 10-Aug-2016 7:15:08 PM
	 * @return
	 */
	public ITextField <FormAuthPage> password () {
		return new TextField <FormAuthPage> (this, By.cssSelector ("#password"));
	}

	/**
	 * @author wasiq.bhamla
	 * @since 10-Aug-2016 7:23:30 PM
	 * @return
	 */
	public IClickable <FormAuthPage> message () {
		return new Clickable <FormAuthPage> (this, By.cssSelector ("#flash"));
	}

	/**
	 * @author wasiq.bhamla
	 * @since 10-Aug-2016 7:16:47 PM
	 * @return
	 */
	public <T extends IBlock> IClickable <T> login () {
		return new Clickable <T> (this, By.cssSelector (".radius"));
	}
}