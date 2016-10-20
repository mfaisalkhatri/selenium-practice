package selenium.controls.interfaces.impl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import selenium.controls.interfaces.IContainer;
import selenium.controls.interfaces.IDragDropPerformer;
import selenium.driver.Browser;
import selenium.driver.StaticDriver;

/**
 * @author wasiq.bhamla
 * @since Oct 18, 2016 3:22:54 PM
 */
public class AbstractContainer implements IContainer {
	protected final WebDriver driver;
	protected WebElement parent;

	/**
	 * @author wasiq.bhamla
	 * @since 18-Oct-2016 9:18:48 PM
	 */
	protected AbstractContainer () {
		this (StaticDriver.driver (Browser.CHROME));
	}

	/**
	 * @author wasiq.bhamla
	 * @since Oct 18, 2016 3:30:09 PM
	 * @param driver
	 * @param locator
	 */
	protected AbstractContainer (final WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 18-Oct-2016 9:06:49 PM
	 * @param driver
	 * @param parent
	 */
	protected AbstractContainer (final WebDriver driver, final WebElement parent) {
		this (driver);
		this.parent = parent;
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.Control#attribute(java.lang.String)
	 */
	@Override
	public String attribute (final String name) {
		return parent ().getAttribute (name);
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.IDraggable#dragDropPerformer()
	 */
	@Override
	public IDragDropPerformer dragDropPerformer () {
		return new DragDropPerformer (driver ());
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.HasDriver#driver()
	 */
	@Override
	public WebDriver driver () {
		return this.driver;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Oct 18, 2016 3:28:31 PM
	 * @return
	 */
	public WebElement find (final By locator) {
		if (parent () == null)
			Assert.fail ("Parent cannot be null.");
		return parent ().findElement (locator);
	}

	/**
	 * @author wasiq.bhamla
	 * @since 18-Oct-2016 9:04:26 PM
	 * @param locator
	 * @return
	 */
	public List <WebElement> finds (final By locator) {
		if (parent () == null)
			Assert.fail ("Parent cannot be null.");
		return parent ().findElements (locator);
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.Control#hasFocus()
	 */
	@Override
	public boolean hasFocus () {
		return parent ().equals (this.driver.switchTo ().activeElement ());
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.Control#hover()
	 */
	@Override
	public void hover () {
		final Actions action = new Actions (this.driver);
		action.moveToElement (parent ()).build ().perform ();
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.Control#isDisplayed()
	 */
	@Override
	public boolean isDisplayed () {
		return parent ().isDisplayed ();
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.Control#isEnabled()
	 */
	@Override
	public boolean isEnabled () {
		return parent ().isEnabled ();
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.Checker#isNull(java.lang.Object)
	 */
	@Override
	public void isNull () {
		Assert.assertNull (text ());
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.Checker#notNull(java.lang.Object)
	 */
	@Override
	public void notNull () {
		Assert.assertNotNull (text ());
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.HasParentControl#parent()
	 */
	@Override
	public WebElement parent () {
		return this.parent;
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.Control#pressKey(org.openqa.selenium.Keys)
	 */
	@Override
	public void pressKey (final Keys key) {
		parent ().sendKeys (key);
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.Selectable#selected()
	 */
	@Override
	public boolean selected () {
		return parent ().isSelected ();
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.HasText#text()
	 */
	@Override
	public String text () {
		return parent ().getText ();
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.TextChecker#textContains(java.lang.String)
	 */
	@Override
	public void textContains (final String expected) {
		if (!text ().contains (expected))
			Assert.fail (text () + " not contains " + expected);
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.TextChecker#textEquals(java.lang.String)
	 */
	@Override
	public void textEquals (final String expected) {
		Assert.assertEquals (text (), expected);
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.TextChecker#textNotEquals(java.lang.String)
	 */
	@Override
	public void textNotEquals (final String expected) {
		Assert.assertNotEquals (text (), expected);
	}
}