package selenium.core.elements.impl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium.core.elements.IPerformDragDrop;

/**
 * @author Wasiq B
 * @since 31-Jul-2016 2:37:28 pm
 */
public class WebDragAndDropPerformer implements IPerformDragDrop {
	protected final WebDriver driver;

	/**
	 * @author Wasiq B
	 * @since 31-Jul-2016 2:38:35 pm
	 * @param driver
	 */
	public WebDragAndDropPerformer (final WebDriver driver) {
		this.driver = driver;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * selenium.core.elements.IPerformDragDrop#dragAndDrop(org.openqa.selenium.
	 * WebElement, int, int)
	 */
	@Override
	public void dragAndDrop (final WebElement drag, final int x, final int y) {
		new Actions (this.driver).dragAndDropBy (drag, x, y).build ().perform ();
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * selenium.core.elements.IPerformDragDrop#dragAndDrop(org.openqa.selenium.
	 * WebElement, org.openqa.selenium.WebElement)
	 */
	@Override
	public void dragAndDrop (final WebElement drag, final WebElement drop) {
		new Actions (this.driver).dragAndDrop (drag, drop).build ().perform ();
	}
}