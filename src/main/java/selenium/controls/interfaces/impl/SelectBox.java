package selenium.controls.interfaces.impl;

import java.util.List;
import java.util.function.Function;
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
public class SelectBox <T extends IContainer> extends AbstractControl <ISelectBox <T>, T> implements ISelectBox <T> {
	/**
	 * @author wasiq.bhamla
	 * @since 18-Oct-2016 9:37:48 PM
	 * @param parentContainer
	 * @param locator
	 */
	public SelectBox (final IContainer parentContainer, final By locator, final Function <ISelectBox <T>, T> target) {
		super (parentContainer, locator, target);
	}

	/**
	 * @author wasiq.bhamla
	 * @since 18-Oct-2016 9:37:48 PM
	 * @param parentContainer
	 * @param parent
	 */
	public SelectBox (final IContainer parentContainer, final WebElement parent, final Function <ISelectBox <T>, T> target) {
		super (parentContainer, parent, target);
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.SelectBox#options()
	 */
	@Override
	public List <IOption <T>> options () {
		return finds (By.tagName ("option")).stream ().filter (opt -> opt.isDisplayed ())
				.map (opt -> new Option <T> (this, opt, e -> this.target.apply (this))).collect (Collectors.toList ());
	}
}