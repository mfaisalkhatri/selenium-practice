/**
 * Added By Faisal K on 14/11/2016
 */
package selenium.pages;

import org.openqa.selenium.By;

import selenium.controls.interfaces.IClickable;
import selenium.controls.interfaces.ITextField;
import selenium.controls.interfaces.impl.Clickable;
import selenium.controls.interfaces.impl.TextBox;

/**
 * @author wasiq.bhamla
 * @since 13-Nov-2016 9:25:58 pm
 */
public class DepositPage extends DashboardPage {

	public DepositPage () {
		super ();

	}

	public ITextField <DepositPage> accountno () {
		return new TextBox <DepositPage> (this, By.name ("accountno"), e -> new DepositPage ());

	}

	public ITextField <DepositPage> amount () {
		return new TextBox <DepositPage> (this, By.name ("ammount"), e -> new DepositPage ());

	}

	public void deposit (final String acno, final String amt, final String desc) {
		accountno ().enterText (acno)
			.amount ()
			.enterText (amt)
			.description ()
			.enterText (desc)
			.submit ();

	}

	public ITextField <DepositPage> description () {
		return new TextBox <DepositPage> (this, By.name ("desc"), e -> new DepositPage ());

	}

	public IClickable <DepositPage> reset () {
		return new Clickable <DepositPage> (this, By.name ("res"), e -> new DepositPage ());
	}

	public IClickable <DepositPage> submit () {
		return new Clickable <DepositPage> (this, By.name ("AccSubmit"), e -> new DepositPage ());
	}

}
