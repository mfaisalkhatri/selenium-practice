package selenium.core.elements;

/**
 * @author Wasiq B
 * @since 26-Jul-2016 5:35:56 pm
 */
public interface IClickable <T extends IBlock> extends IElement, IHasText {
	/**
	 * @author Wasiq B
	 * @since 26-Jul-2016 5:37:57 pm
	 * @return
	 */
	T click (Class <T> target);
}
