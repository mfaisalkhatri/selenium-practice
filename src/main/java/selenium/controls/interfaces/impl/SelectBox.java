package selenium.controls.interfaces.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium.controls.interfaces.IContainer;
import selenium.controls.interfaces.IOption;
import selenium.controls.interfaces.ISelectBox;

/**
 * @author wasiq.bhamla
 * @since 18-Oct-2016 9:37:48 PM
 */
public class SelectBox extends AbstractControl implements ISelectBox {
	/**
	 * @author wasiq.bhamla
	 * @since 18-Oct-2016 9:37:48 PM
	 * @param parentContainer
	 * @param locator
	 */
	public SelectBox (final IContainer parentContainer, final By locator) {
		super (parentContainer, locator);
	}

	/**
	 * @author wasiq.bhamla
	 * @since 18-Oct-2016 9:37:48 PM
	 * @param parentContainer
	 * @param parent
	 */
	public SelectBox (final IContainer parentContainer, final WebElement parent) {
		super (parentContainer, parent);
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.SelectBox#options()
	 */
	@Override
	public List <IOption> options () {
		return finds (By.tagName ("option")).stream ().filter (opt -> opt.isDisplayed ())
				.map (opt -> new Option (this, opt)).collect (Collectors.toList ());
	}
}