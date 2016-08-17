package selenium.core.tests;

import javax.naming.OperationNotSupportedException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import selenium.core.Session;
import selenium.core.Threaded;
import selenium.core.driver.environments.Firefox;
import selenium.core.pages.FormAuthPage;
import selenium.core.pages.FormSecurePage;
import selenium.core.pages.InternetPage;

/**
 * @author Wasiq B
 * @since 06-Aug-2016 10:01:05 pm
 */
public class SeleniumTest {
	private Session session;

	@BeforeClass
	public void setup () {
		this.session = Threaded.with (Firefox.class);
	}

	@Test
	public void testFormAuthentication () throws OperationNotSupportedException {
		final InternetPage p = this.session.navigateTo ("http://the-internet.herokuapp.com/")
				.current (InternetPage.class).currentBlock ();
		FormSecurePage form = p. <FormAuthPage>label ("Form Authentication").click (FormAuthPage.class).userName ()
				.enterText ("tomsmith", FormAuthPage.class).password ()
				.enterText ("SuperSecretPassword!", FormAuthPage.class). <FormSecurePage>login ()
				.click (FormSecurePage.class);
		String msg = form.message ().text ();
		Assert.assertTrue (msg.startsWith ("You logged into a secure area!"));

		form.logout ().click (FormAuthPage.class);
	}

	@AfterClass
	public void tearDown () {
		this.session.end ();
	}
}