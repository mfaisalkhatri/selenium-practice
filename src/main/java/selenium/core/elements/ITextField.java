package selenium.core.elements;

import selenium.core.Key;

/**
 * @author Wasiq B
 * @since 26-Jul-2016 6:01:28 pm
 */
public interface ITextField <T extends IBlock> extends IClickable <T> {
	/**
	 * @author Wasiq B
	 * @since 26-Jul-2016 6:02:45 pm
	 * @param text
	 * @return
	 */
	T appendText (String text);

	/**
	 * @author Wasiq B
	 * @since 26-Jul-2016 6:02:48 pm
	 * @param text
	 * @return
	 */
	T enterText (String text);

	/**
	 * @author Wasiq B
	 * @since 26-Jul-2016 6:02:52 pm
	 * @param key
	 * @return
	 */
	T press (Key key);
}
