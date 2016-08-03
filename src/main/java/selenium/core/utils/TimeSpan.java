package selenium.core.utils;

import java.util.concurrent.TimeUnit;

/**
 * @author Wasiq B
 * @since 26-Jul-2016 6:24:13 pm
 */
public class TimeSpan {
	private final long		time;
	private final TimeUnit	unit;

	/**
	 * @author Wasiq B
	 * @since 26-Jul-2016 6:27:34 pm
	 * @param time
	 * @param unit
	 */
	public TimeSpan (final long time, final TimeUnit unit) {
		this.time = time;
		this.unit = unit;
	}

	/**
	 * @author Wasiq B
	 * @since 26-Jul-2016 6:27:47 pm
	 * @return the time
	 */
	public long getTime () {
		return this.time;
	}

	/**
	 * @author Wasiq B
	 * @since 26-Jul-2016 6:27:47 pm
	 * @return the unit
	 */
	public TimeUnit getUnit () {
		return this.unit;
	}
}
