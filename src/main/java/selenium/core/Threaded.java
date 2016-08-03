package selenium.core;

import selenium.core.driver.IDriverEnvironment;

/**
 * @author Wasiq B
 * @since 31-Jul-2016 12:53:05 pm
 */
public class Threaded {
	private static final ThreadLocal <Session> threadLocalSession = new ThreadLocal<> ();

	/**
	 * @author Wasiq B
	 * @since 31-Jul-2016 12:55:39 pm
	 * @return
	 */
	@SuppressWarnings ("unchecked")
	public static <TSession extends Session> TSession current () {
		return (TSession) threadLocalSession.get ();
	}

	/**
	 * @author Wasiq B
	 * @since 31-Jul-2016 1:01:32 pm
	 * @param session
	 */
	public static <TSession extends Session> void current (final TSession session) {
		threadLocalSession.set (session);
	}

	/**
	 * @author Wasiq B
	 * @since 31-Jul-2016 1:05:49 pm
	 * @param driver
	 * @return
	 */
	public static <TSession extends Session, TDriver extends IDriverEnvironment> TSession with (final Class <TDriver> driver) {
		if (current () != null) {
			current ().end ();
			current (null);
		}
		current (session);
		return null;
	}
}
