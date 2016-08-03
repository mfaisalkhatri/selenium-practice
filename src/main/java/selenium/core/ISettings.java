package selenium.core;

/**
 * @author Wasiq B
 * @since 26-Jul-2016 6:17:48 pm
 */
public interface ISettings {
	/**
	 * @author Wasiq B
	 * @since 26-Jul-2016 6:18:46 pm
	 * @return
	 */
	boolean captureScreenOnVerificationFailure ();

	/**
	 * @author Wasiq B
	 * @since 26-Jul-2016 6:20:40 pm
	 * @param value
	 */
	void captureScreenOnVerificationFailure (boolean value);

	/**
	 * @author Wasiq B
	 * @since 26-Jul-2016 6:18:14 pm
	 * @return
	 */
	String screenCapturePath ();

	/**
	 * @author Wasiq B
	 * @since 26-Jul-2016 6:20:54 pm
	 * @param value
	 */
	void screenCapturePath (String value);
}
