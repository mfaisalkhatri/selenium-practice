package selenium.core.elements.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;

import selenium.core.elements.IBlock;
import selenium.core.elements.IOption;
import selenium.core.elements.IRadioButton;

/**
 * @author wasiq.bhamla
 * @since Aug 4, 2016 4:40:05 PM
 */
public class RadioButtons <T extends IBlock> extends Element implements IRadioButton <T> {
	private By locator;

	/**
	 * @author wasiq.bhamla
	 * @since Aug 4, 2016 4:42:19 PM
	 * @param parent
	 * @param locator
	 */
	public RadioButtons (IBlock parent, By locator) {
		super (parent, locator);
		this.locator = locator;
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.core.elements.ISelectBox#options()
	 */
	@Override
	public List <IOption <T>> options () {
		return parentBlock ().parent ().findElements (this.locator).stream ().filter (opt -> opt.isDisplayed ())
				.map (opt -> new RadioButton <T> (parentBlock (), opt)).collect (Collectors.toList ());
	}
}