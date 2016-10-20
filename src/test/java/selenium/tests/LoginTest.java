package selenium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import selenium.pages.LoginPage;
import selenium.pages.NewCustomerPage;

/**
 * @author wasiq.bhamla
 * @since 25-Sep-2016 10:03:12 PM
 */
public class LoginTest extends AbstractTest {
	@Test
	public void testLogin () {
		final LoginPage login = new LoginPage ();
		login.doLogin ("mngr50086", "YqUqUdu").sideBar ().link ("New Customer").click ();

		NewCustomerPage cust = new NewCustomerPage ();
		cust.create ("Wasiq Bhamla", true, "06211985", "Mazagaon", "Mumbai", "Maharashtra", "400010", "9987063686", "wasbhamla2004@gmail.com",
				"1234");

		cust = new NewCustomerPage ();
		final String message = cust.resultTable ().row (0).column (0).text ();
		Assert.assertEquals (message, "Customer Registered Successfully!!!");
	}
}