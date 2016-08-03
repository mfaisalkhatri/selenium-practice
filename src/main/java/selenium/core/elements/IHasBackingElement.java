package selenium.core.elements;

import org.openqa.selenium.WebElement;

/**
 * @author Wasiq B
 * @since 26-Jul-2016 5:52:31 pm
 */
public interface IHasBackingElement {
	/**
	 * @author Wasiq B
	 * @since 26-Jul-2016 5:53:20 pm
	 * @return
	 */
	WebElement parent ();

	/**
	 * @author Wasiq B
	 * @since 26-Jul-2016 5:53:24 pm
	 * @param element
	 */
	void parent (WebElement element);
}