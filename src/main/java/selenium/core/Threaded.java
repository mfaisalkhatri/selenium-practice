package selenium.core;

import java.lang.reflect.ParameterizedType;

import selenium.core.driver.IDriverEnvironment;

/**
 * @author Wasiq B
 * @since 31-Jul-2016 12:53:05 pm
 */
public class Threaded {
	private static final ThreadLocal <Session> threadLocalSession = new ThreadLocal<> ();

	/**
	 * @author Wasiq B
	 * @since 05-Aug-2016 4:13:18 pm
	 */
	private static void close () {
		if (current () != null) {
			current ().end ();
			current (null);
		}
	}

	/**
	 * @author Wasiq B
	 * @since 31-Jul-2016 12:55:39 pm
	 * @return
	 */
	public static Session current () {
		return threadLocalSession.get ();
	}

	/**
	 * @author Wasiq B
	 * @since 31-Jul-2016 1:01:32 pm
	 * @param session
	 */
	public static void current (final Session session) {
		threadLocalSession.set (session);
	}

	/**
	 * @author Wasiq B
	 * @since 31-Jul-2016 1:05:49 pm
	 * @param driver
	 * @return
	 */
	@SuppressWarnings ("unchecked")
	public static <TDriver extends IDriverEnvironment> Session with (final Class <TDriver> driver) {
		close ();
		final ParameterizedType type = (ParameterizedType) driver.getGenericSuperclass ();
		final Class <TDriver> cls = (Class <TDriver>) type.getActualTypeArguments () [0];
		try {
			final TDriver d = cls.newInstance ();
			current (new Session (d));
		}
		catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace ();
		}
		return current ();
	}
}