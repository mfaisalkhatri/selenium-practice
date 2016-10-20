package selenium.controls.interfaces;

/**
 * @author wasiq.bhamla
 * @since Oct 18, 2016 12:09:27 PM
 */
public interface ITextChecker extends IChecker {
	/**
	 * @author wasiq.bhamla
	 * @since Oct 18, 2016 12:14:34 PM
	 * @param expected
	 */
	void textEquals (String expected);

	/**
	 * @author wasiq.bhamla
	 * @since Oct 18, 2016 12:16:53 PM
	 * @param expected
	 */
	void textNotEquals (String expected);

	/**
	 * @author wasiq.bhamla
	 * @since Oct 18, 2016 12:18:27 PM
	 * @param expected
	 */
	void textContains (String expected);
}