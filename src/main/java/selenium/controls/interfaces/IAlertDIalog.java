package selenium.controls.interfaces;

/**
 * @author wasiq.bhamla
 * @since Oct 18, 2016 12:33:43 PM
 */
public interface IAlertDIalog extends IContainer {
	/**
	 * @author wasiq.bhamla
	 * @since Oct 18, 2016 12:35:06 PM
	 */
	void accept ();

	/**
	 * @author wasiq.bhamla
	 * @since Oct 18, 2016 12:35:12 PM
	 * @param text
	 */
	void enterText (String text);

	/**
	 * @author wasiq.bhamla
	 * @since Oct 18, 2016 12:35:09 PM
	 */
	void reject ();
}