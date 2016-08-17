package selenium.core.elements;

/**
 * @author Wasiq B
 * @since 26-Jul-2016 6:08:35 pm
 */
public interface ICheckBox <T extends IBlock> extends ISelectable, IClickable <T> {
	/**
	 * @author Wasiq B
	 * @since 26-Jul-2016 6:09:53 pm
	 * @return
	 */
	T check (Class <T> target);

	/**
	 * @author Wasiq B
	 * @since 26-Jul-2016 6:09:57 pm
	 * @return
	 */
	T toggle (Class <T> target);

	/**
	 * @author Wasiq B
	 * @since 26-Jul-2016 6:10:00 pm
	 * @return
	 */
	T uncheck (Class <T> target);
}
