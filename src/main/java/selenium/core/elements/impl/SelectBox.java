package selenium.core.elements.impl;

import java.util.ArrayList;
import java.util.List;

import javax.naming.OperationNotSupportedException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium.core.elements.IBlock;
import selenium.core.elements.IOption;
import selenium.core.elements.ISelectBox;

/**
 * @author Wasiq B
 * @since 03-Aug-2016 9:22:45 pm
 */
public class SelectBox <T extends IBlock> extends Element implements ISelectBox <T> {
	/**
	 * @author Wasiq B
	 * @since 03-Aug-2016 9:22:45 pm
	 * @param parent
	 * @param locator
	 */
	public SelectBox (final IBlock parent, final By locator) {
		super (parent, locator);
	}

	/**
	 * @author Wasiq B
	 * @since 03-Aug-2016 9:22:45 pm
	 * @param parent
	 * @param tag
	 */
	public SelectBox (final IBlock parent, final WebElement tag) {
		super (parent, tag);
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.core.elements.ISelectBox#options()
	 */
	@Override
	public List <IOption <T>> options () {
		final List <IOption <T>> options = new ArrayList<> ();
		try {
			findElements (By.tagName ("option")).forEach (e -> options.add (new Option <T> (this.parentBlock, e)));
		}
		catch (final OperationNotSupportedException e) {
			e.printStackTrace ();
		}
		return options;
	}
}