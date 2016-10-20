package selenium.controls.interfaces;

/**
 * @author wasiq.bhamla
 * @since Oct 18, 2016 12:36:03 PM
 */
public interface ITextField <T extends IContainer> extends IControl {
	/**
	 * @author wasiq.bhamla
	 * @since Oct 20, 2016 2:20:49 PM
	 * @param text
	 * @return
	 */
	T sendKeys (String text);

	/**
	 * @author wasiq.bhamla
	 * @since Oct 18, 2016 12:38:07 PM
	 * @param text
	 */
	T appendText (String text);

	/**
	 * @author wasiq.bhamla
	 * @since Oct 18, 2016 12:38:04 PM
	 * @param text
	 */
	T enterText (String text);
}