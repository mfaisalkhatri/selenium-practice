package selenium.controls.interfaces.impl;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.openqa.selenium.By;

import selenium.controls.interfaces.IContainer;
import selenium.controls.interfaces.IOption;
import selenium.controls.interfaces.IRadioButton;

/**
 * @author wasiq.bhamla
 * @since Oct 19, 2016 12:01:45 PM
 */
public class RadioButtons <T extends IContainer> implements IRadioButton <T> {
	private final By locator;
	private final IContainer parent;
	private final Function <IRadioButton <T>, T> target;

	/**
	 * @author wasiq.bhamla
	 * @since Oct 19, 2016 12:03:14 PM
	 * @param parent
	 * @param locator
	 */
	public RadioButtons (IContainer parent, By locator, Function <IRadioButton <T>, T> target) {
		this.parent = parent;
		this.locator = locator;
		this.target = target;
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.IRadioButton#options()
	 */
	@Override
	public List <IOption <T>> options () {
		return this.parent.parent ().findElements (this.locator).stream ().filter (opt -> opt.isDisplayed ())
				.map (opt -> new RadioButton <T> (this.parent, opt, e -> this.target.apply (this))).collect (Collectors.toList ());
	}
}