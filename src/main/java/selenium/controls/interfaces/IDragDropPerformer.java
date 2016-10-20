package selenium.controls.interfaces;

import org.openqa.selenium.WebElement;

/**
 * @author wasiq.bhamla
 * @since Oct 19, 2016 12:56:14 PM
 */
public interface IDragDropPerformer {
	/**
	 * @author wasiq.bhamla
	 * @since Oct 19, 2016 12:57:21 PM
	 * @param source
	 * @param x
	 * @param y
	 */
	void dragDrop (WebElement source, int x, int y);

	/**
	 * @author wasiq.bhamla
	 * @since Oct 19, 2016 12:56:54 PM
	 * @param source
	 * @param target
	 */
	void dragDrop (WebElement source, WebElement target);
}
