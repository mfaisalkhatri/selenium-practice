package selenium.controls.interfaces.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import selenium.controls.interfaces.ITableColumn;
import selenium.controls.interfaces.ITableRow;

/**
 * @author wasiq.bhamla
 * @since Oct 19, 2016 2:43:26 PM
 */
public class TableRow <TCol extends ITableColumn> extends AbstractContainer implements ITableRow <TCol> {
	private final List <TCol> columns;

	/**
	 * @author wasiq.bhamla
	 * @since Oct 19, 2016 2:43:26 PM
	 * @param driver
	 * @param parent
	 */
	public TableRow (final WebDriver driver, final WebElement parent, final Class <TCol> cls) {
		super (driver, parent);
		this.columns = finds (By.tagName ("td")).stream ().filter (e -> e.isDisplayed ()).map (e -> instance (cls, driver, parent))
				.collect (Collectors.toList ());
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.ITableRow#column(int)
	 */
	@Override
	public TCol column (final int index) {
		if (index < 0 || index >= this.columns.size ())
			return null;
		return this.columns.get (index);
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.ITableRow#columns()
	 */
	@Override
	public List <TCol> columns () {
		return this.columns;
	}

	/**
	 * @author wasiq.bhamla
	 * @since Oct 19, 2016 4:00:56 PM
	 * @param cls
	 * @param d
	 * @param e
	 * @return
	 */
	private TCol instance (final Class <TCol> cls, final WebDriver d, final WebElement e) {
		try {
			return cls.getDeclaredConstructor (WebDriver.class, WebElement.class).newInstance (d, e);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException
				| SecurityException e1) {
			e1.printStackTrace ();
		}
		return null;
	}
}