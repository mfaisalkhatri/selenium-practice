package selenium.controls.interfaces.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium.controls.interfaces.IContainer;

/**
 * @author wasiq.bhamla
 * @since 18-Oct-2016 9:30:47 PM
 */
public class CheckBox extends Clickable implements selenium.controls.interfaces.ICheckBox {
	/**
	 * @author wasiq.bhamla
	 * @since 18-Oct-2016 9:30:47 PM
	 * @param parentContainer
	 * @param locator
	 */
	public CheckBox (final IContainer parentContainer, final By locator) {
		super (parentContainer, locator);
	}

	/**
	 * @author wasiq.bhamla
	 * @since 18-Oct-2016 9:30:47 PM
	 * @param parentContainer
	 * @param parent
	 */
	public CheckBox (final IContainer parentContainer, final WebElement parent) {
		super (parentContainer, parent);
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.CheckBox#check()
	 */
	@Override
	public void check () {
		if (!selected ()) {
			click ();
		}
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.CheckBox#toggle()
	 */
	@Override
	public void toggle () {
		click ();
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.CheckBox#uncheck()
	 */
	@Override
	public void uncheck () {
		if (selected ()) {
			click ();
		}
	}
}