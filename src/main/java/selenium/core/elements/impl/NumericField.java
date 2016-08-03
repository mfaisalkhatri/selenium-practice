package selenium.core.elements.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium.core.elements.IBlock;
import selenium.core.elements.INumericField;

/**
 * @author Wasiq B
 * @since 02-Aug-2016 9:33:21 pm
 */
public class NumericField <T extends IBlock> extends TextField <T> implements INumericField <T> {
	/**
	 * @author Wasiq B
	 * @since 02-Aug-2016 9:34:03 pm
	 * @param parent
	 * @param locator
	 */
	public NumericField (final IBlock parent, final By locator) {
		super (parent, locator);
	}

	/**
	 * @author Wasiq B
	 * @since 02-Aug-2016 9:34:03 pm
	 * @param parent
	 * @param tag
	 */
	public NumericField (final IBlock parent, final WebElement tag) {
		super (parent, tag);
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.core.elements.INumericField#enterNumber(double)
	 */
	@Override
	public T enterNumber (final double value) {
		return super.enterText (Double.toString (value));
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.core.elements.INumericField#enterNumber(long)
	 */
	@Override
	public T enterNumber (final long value) {
		return super.enterText (Long.toString (value));
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.core.elements.INumericField#value()
	 */
	@Override
	public double value () {
		return Double.parseDouble (text ());
	}
}