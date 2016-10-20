package selenium.controls.interfaces;

import org.openqa.selenium.Keys;

/**
 * @author wasiq.bhamla
 * @since Oct 18, 2016 12:25:50 PM
 */
public interface IControl extends IHasDriver, ISelectable, IDraggable, IHasText {
	/**
	 * @author wasiq.bhamla
	 * @since Oct 18, 2016 12:30:09 PM
	 * @param name
	 * @return
	 */
	String attribute (String name);

	/**
	 * @author wasiq.bhamla
	 * @since Oct 18, 2016 12:27:21 PM
	 * @return
	 */
	boolean hasFocus ();

	/**
	 * @author wasiq.bhamla
	 * @since Oct 18, 2016 12:29:37 PM
	 */
	void hover ();

	/**
	 * @author wasiq.bhamla
	 * @since Oct 18, 2016 12:27:24 PM
	 * @return
	 */
	boolean isDisplayed ();

	/**
	 * @author wasiq.bhamla
	 * @since Oct 18, 2016 12:27:28 PM
	 * @return
	 */
	boolean isEnabled ();

	/**
	 * @author wasiq.bhamla
	 * @since Oct 18, 2016 12:31:44 PM
	 * @param key
	 */
	void pressKey (Keys key);
}
