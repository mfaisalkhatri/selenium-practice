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

	public ITextField <NewCustomerPage> address () {
		return new TextBox <NewCustomerPage> (this, By.name ("addr"), e -> new NewCustomerPage ());
	}

	public ITextField <NewCustomerPage> city () {
		return new TextBox <NewCustomerPage> (this, By.name ("city"), e -> new NewCustomerPage ());
	}

	public void create (final String name, final boolean male, final String dob, final String address,
			final String city, final String state, final String pin, final String mobile, final String email,
			final String password) {
		customerName ().enterText (name);
		if (male)
			male ().click ();
		else
			female ().click ();
		dateOfBirth ().parent ()
			.sendKeys (dob);
		address ().enterText (address)
			.city ()
			.enterText (city)
			.state ()
			.enterText (state)
			.pin ()
			.enterText (pin)
			.mobileNo ()
			.enterText (mobile)
			.email ()
			.enterText (email)
			.password ()
			.enterText (password)
			.submit ()
			.click ();
	}

	public ITextField <NewCustomerPage> customerName () {
		return new TextBox <NewCustomerPage> (this, By.name ("name"), e -> new NewCustomerPage ());
	}

	public ITextField <NewCustomerPage> dateOfBirth () {
		return new TextBox <NewCustomerPage> (this, By.id ("dob"), e -> new NewCustomerPage ());
	}

	public ITextField <NewCustomerPage> email () {
		return new TextBox <NewCustomerPage> (this, By.name ("emailid"), e -> new NewCustomerPage ());
	}

	public IClickable <NewCustomerPage> female () {
		return new Clickable <NewCustomerPage> (this, By.cssSelector ("input[value='f']"), e -> new NewCustomerPage ());
	}

	public IClickable <NewCustomerPage> male () {
		return new Clickable <NewCustomerPage> (this, By.cssSelector ("input[value='m']"), e -> new NewCustomerPage ());
	}

	public ITextField <NewCustomerPage> mobileNo () {
		return new TextBox <NewCustomerPage> (this, By.name ("telephoneno"), e -> new NewCustomerPage ());
	}

	public ITextField <NewCustomerPage> password () {
		return new TextBox <NewCustomerPage> (this, By.name ("password"), e -> new NewCustomerPage ());
	}

	public ITextField <NewCustomerPage> pin () {
		return new TextBox <NewCustomerPage> (this, By.name ("pinno"), e -> new NewCustomerPage ());
	}

	public IClickable <NewCustomerPage> reset () {
		return new Clickable <NewCustomerPage> (this, By.name ("res"), e -> new NewCustomerPage ());
	}

	public ITable <SimpleTableColumn> resultTable () {
		return new Table <NewCustomerPage, SimpleTableColumn> (this, By.id ("customer"), SimpleTableColumn.class,
				e -> new NewCustomerPage ());
	}

	public ITextField <NewCustomerPage> state () {
		return new TextBox <NewCustomerPage> (this, By.name ("state"), e -> new NewCustomerPage ());
	}

	public IClickable <DashboardPage> submit () {
		return new Clickable <DashboardPage> (this, By.name ("sub"), e -> new DashboardPage ());
	}
}