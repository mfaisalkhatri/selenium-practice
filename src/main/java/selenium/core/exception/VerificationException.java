package selenium.core.exception;

/**
 * @author Wasiq B
 * @since 26-Jul-2016 6:14:50 pm
 */
public class VerificationException extends Exception {
	private static final long serialVersionUID = 4405159714301541998L;

	/**
	 * @author Wasiq B
	 * @since 26-Jul-2016 6:14:51 pm
	 * @param message
	 */
	public VerificationException (final String message) {
		super (message);
	}

	/**
	 * @author Wasiq B
	 * @since 26-Jul-2016 6:14:51 pm
	 * @param message
	 * @param cause
	 */
	public VerificationException (final String message, final Throwable cause) {
		super (message, cause);
	}
}
