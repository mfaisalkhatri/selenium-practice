package selenium.controls.interfaces;

/**
 * @author wasiq.bhamla
 * @since Oct 18, 2016 12:36:03 PM
 */
public interface ITextField extends IControl {
	/**
	 * @author wasiq.bhamla
	 * @since Oct 18, 2016 12:38:07 PM
	 * @param text
	 */
	void appendText (String text);

	/**
	 * @author wasiq.bhamla
	 * @since Oct 18, 2016 12:38:04 PM
	 * @param text
	 */
	void enterText (String text);
}