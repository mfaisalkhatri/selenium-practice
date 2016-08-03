package selenium.core.elements;

/**
 * @author Wasiq B
 * @since 26-Jul-2016 5:29:25 pm
 */
public interface IAlertDialog extends IBlock, IHasText {
	/**
	 * @author Wasiq B
	 * @since 26-Jul-2016 5:30:02 pm
	 * @return
	 */
	<T extends IBlock> T accept ();

	/**
	 * @author Wasiq B
	 * @since 26-Jul-2016 5:30:31 pm
	 * @return
	 */
	<T extends IBlock> T decline ();

	/**
	 * @author Wasiq B
	 * @since 26-Jul-2016 5:30:57 pm
	 * @param text
	 * @return
	 */
	IAlertDialog enterText (String text);
}
