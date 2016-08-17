package selenium.core.elements.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import selenium.core.elements.IBlock;
import selenium.core.elements.IDateField;

/**
 * @author Wasiq B
 * @since 02-Aug-2016 9:38:34 pm
 */
public class DateField <T extends IBlock> extends TextField <T> implements IDateField <T> {
	/**
	 * @author Wasiq B
	 * @since 02-Aug-2016 9:38:52 pm
	 * @param parent
	 * @param locator
	 */
	public DateField (final IBlock parent, final By locator) {
		super (parent, locator);
	}

	/**
	 * @author Wasiq B
	 * @since 02-Aug-2016 9:38:52 pm
	 * @param parent
	 * @param tag
	 */
	public DateField (final IBlock parent, final WebElement tag) {
		super (parent, tag);
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.core.elements.IDateField#enterDate(java.util.Date)
	 */
	@Override
	public T enterDate (final Date date, Class <T> target) {
		final JavascriptExecutor js = (JavascriptExecutor) session ().driver ();
		String script = "arguments[0].value = '%1$s';";
		final SimpleDateFormat sf = new SimpleDateFormat ("yyyy-MM-dd");
		script = String.format (script, sf.format (date));
		js.executeScript (script, parent ());
		return session ().current (parent (), target).currentBlock ();
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.core.elements.IDateField#value()
	 */
	@Override
	public Date value () {
		final SimpleDateFormat sf = new SimpleDateFormat ("dd/MM/yyyy");
		try {
			return sf.parse (text ());
		}
		catch (final ParseException e) {
			e.printStackTrace ();
		}
		return null;
	}
}