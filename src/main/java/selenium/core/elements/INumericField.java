package selenium.core.elements;

/**
 * @author Wasiq B
 * @since 26-Jul-2016 6:04:18 pm
 */
public interface INumericField <T extends IBlock> extends ITextField <T> {
	/**
	 * @author Wasiq B
	 * @since 26-Jul-2016 6:05:33 pm
	 * @param value
	 * @return
	 */
	T enterNumber (double value);

	/**
	 * @author Wasiq B
	 * @since 26-Jul-2016 6:05:36 pm
	 * @param value
	 * @return
	 */
	T enterNumber (long value);

	/**
	 * @author Wasiq B
	 * @since 26-Jul-2016 6:05:41 pm
	 * @return
	 */
	double value ();
}
