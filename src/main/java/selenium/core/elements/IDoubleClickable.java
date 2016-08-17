package selenium.core.elements;

/**
 * @author Wasiq B
 * @since 26-Jul-2016 5:48:57 pm
 */
public interface IDoubleClickable <T extends IBlock> extends IClickable <T> {
	/**
	 * @author Wasiq B
	 * @since 26-Jul-2016 5:49:34 pm
	 * @return
	 */
	T doubleClick (Class <T> target);
}
