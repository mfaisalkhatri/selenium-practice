package selenium.controls.interfaces.impl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium.controls.interfaces.IDragDropPerformer;

/**
 * @author wasiq.bhamla
 * @since Oct 19, 2016 12:58:32 PM
 */
public class DragDropPerformer implements IDragDropPerformer {
	private final WebDriver driver;

	/**
	 * @author wasiq.bhamla
	 * @since Oct 19, 2016 12:58:32 PM
	 */
	public DragDropPerformer (final WebDriver driver) {
		this.driver = driver;
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.IDragDropPerformer#dragDrop(org.openqa.selenium.WebElement, int, int)
	 */
	@Override
	public void dragDrop (final WebElement source, final int x, final int y) {
		new Actions (this.driver).dragAndDropBy (source, x, y).build ().perform ();
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.IDragDropPerformer#dragDrop(org.openqa.selenium.WebElement, org.openqa.selenium.WebElement)
	 */
	@Override
	public void dragDrop (final WebElement source, final WebElement target) {
		new Actions (this.driver).dragAndDrop (source, target).build ().perform ();
	}
}