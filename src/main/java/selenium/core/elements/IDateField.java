package selenium.core.elements;

import java.util.Date;

/**
 * @author Wasiq B
 * @since 26-Jul-2016 6:06:30 pm
 */
public interface IDateField <T extends IBlock> extends ITextField <T> {
	/**
	 * @author Wasiq B
	 * @since 26-Jul-2016 6:07:16 pm
	 * @param date
	 * @return
	 */
	T enterDate (Date date, Class <T> target);

	/**
	 * @author Wasiq B
	 * @since 26-Jul-2016 6:07:19 pm
	 * @return
	 */
	Date value ();
}
