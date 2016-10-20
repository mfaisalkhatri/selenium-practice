package selenium.controls.interfaces.impl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import selenium.controls.interfaces.ITableColumn;

/**
 * @author wasiq.bhamla
 * @since Oct 19, 2016 2:40:22 PM
 */
public class SimpleTableColumn extends AbstractContainer implements ITableColumn {
	/**
	 * @author wasiq.bhamla
	 * @since Oct 19, 2016 3:40:38 PM
	 * @param driver
	 * @param parent
	 */
	public SimpleTableColumn (final WebDriver driver, final WebElement parent) {
		super (driver, parent);
	}
}