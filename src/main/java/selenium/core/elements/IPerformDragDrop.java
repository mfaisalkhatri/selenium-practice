package selenium.core.elements;

import org.openqa.selenium.WebElement;

/**
 * @author Wasiq B
 * @since 26-Jul-2016 5:50:43 pm
 */
public interface IPerformDragDrop {
	/**
	 * @author Wasiq B
	 * @since 26-Jul-2016 5:51:49 pm
	 * @param drag
	 * @param x
	 * @param y
	 */
	void dragAndDrop (WebElement drag, int x, int y);

	/**
	 * @author Wasiq B
	 * @since 26-Jul-2016 5:51:52 pm
	 * @param drag
	 * @param drop
	 */
	void dragAndDrop (WebElement drag, WebElement drop);
}
