package selenium.pages;

import org.openqa.selenium.By;

import selenium.controls.interfaces.IClickable;
import selenium.controls.interfaces.ITable;
import selenium.controls.interfaces.ITextField;
import selenium.controls.interfaces.impl.Clickable;
import selenium.controls.interfaces.impl.SimpleTableColumn;
import selenium.controls.interfaces.impl.Table;
import selenium.controls.interfaces.impl.TextBox;

/**
 * @author wasiq.bhamla
 * @since 19-Oct-2016 9:15:31 PM
 */
public class NewCustomerPage extends DashboardPage {
	/**
	 * @author wasiq.bhamla
	 * @since 19-Oct-2016 9:15:32 PM
	 */
	public NewCustomerPage () {
		super ();
	}

	public ITextField address () {
		return new TextBox (this, By.name ("addr"));
	}

	public ITextField city () {
		return new TextBox (this, By.name ("city"));
	}

	public void create (final String name, final boolean male, final String dob, final String address, final String city, final String state, final String pin, final String mobile, final String email, final String password) {
		customerName ().enterText (name);
		if (male)
			male ().click ();
		else
			female ().click ();
		dateOfBirth ().parent ().sendKeys (dob);
		address ().enterText (address);
		city ().enterText (city);
		state ().enterText (state);
		pin ().enterText (pin);
		mobileNo ().enterText (mobile);
		email ().enterText (email);
		password ().enterText (password);
		submit ().click ();
	}

	public ITextField customerName () {
		return new TextBox (this, By.name ("name"));
	}

	public ITextField dateOfBirth () {
		return new TextBox (this, By.id ("dob"));
	}

	public ITextField email () {
		return new TextBox (this, By.name ("emailid"));
	}

	public IClickable female () {
		return new Clickable (this, By.cssSelector ("input[value='f']"));
	}

	public IClickable male () {
		return new Clickable (this, By.cssSelector ("input[value='m']"));
	}

	public ITextField mobileNo () {
		return new TextBox (this, By.name ("telephoneno"));
	}

	public ITextField password () {
		return new TextBox (this, By.name ("password"));
	}

	public ITextField pin () {
		return new TextBox (this, By.name ("pinno"));
	}

	public IClickable reset () {
		return new Clickable (this, By.name ("res"));
	}

	public ITable <SimpleTableColumn> resultTable () {
		return new Table<> (this, By.id ("customer"), SimpleTableColumn.class);
	}

	public ITextField state () {
		return new TextBox (this, By.name ("state"));
	}

	public IClickable submit () {
		return new Clickable (this, By.name ("sub"));
	}
}