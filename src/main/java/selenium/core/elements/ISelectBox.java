package selenium.core.elements;

import java.util.List;

/**
 * @author Wasiq B
 * @since 26-Jul-2016 5:55:52 pm
 */
public interface ISelectBox <T extends IBlock> extends IElement {
	/**
	 * @author Wasiq B
	 * @since 26-Jul-2016 5:56:57 pm
	 * @return
	 */
	List <IOption <T>> options ();
}
