package selenium.controls.interfaces.impl;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.openqa.selenium.By;

import selenium.controls.interfaces.IClickable;
import selenium.controls.interfaces.IContainer;
import selenium.controls.interfaces.ITable;
import selenium.controls.interfaces.ITableColumn;
import selenium.controls.interfaces.ITableRow;

/**
 * @author wasiq.bhamla
 * @since Oct 19, 2016 4:02:32 PM
 */
public class Table <T extends IContainer, TCol extends ITableColumn> extends AbstractControl <IClickable <T>, T> implements ITable <TCol> {
	private final List <ITableRow <TCol>> rows;

	/**
	 * @author wasiq.bhamla
	 * @since Oct 19, 2016 4:06:17 PM
	 * @param parentContainer
	 * @param locator
	 */
	public Table (final IContainer parentContainer, final By locator, final Class <TCol> cls, final Function <IClickable <T>, T> target) {
		super (parentContainer, locator, target);
		this.rows = finds (By.tagName ("tr")).stream ().filter (e -> e.isDisplayed ()).map (e -> new TableRow<> (driver (), e, cls))
				.collect (Collectors.toList ());
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.ITable#row(int)
	 */
	@Override
	public ITableRow <TCol> row (final int index) {
		if (index < 0 || index >= this.rows.size ())
			return null;
		return this.rows.get (index);
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.ITable#rows()
	 */
	@Override
	public List <ITableRow <TCol>> rows () {
		return this.rows;
	}
}