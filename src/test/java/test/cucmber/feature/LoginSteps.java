package test.cucmber.feature;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import cucumber.api.java8.En;

/**
 * @author Wasiq B
 * @since 30-Jul-2016 6:03:30 pm
 */
public class LoginSteps implements En {
	private static WebDriver	driver;
	private static WebElement	form;

	/**
	 * @author Wasiq B
	 * @since 30-Jul-2016 6:17:08 pm
	 */
	public LoginSteps () {
		Given ("^I navigate to \"([^\"]*)\"$", (final String url) -> {
			driver = new FirefoxDriver ();
			driver.navigate ().to (url);
			driver.manage ().window ().maximize ();
			driver.manage ().timeouts ().implicitlyWait (10, TimeUnit.SECONDS);
		});

		When ("^I login with User name as \"([^\"]*)\"$", (final String user) -> {
			form = driver.findElement (By.cssSelector ("#login"));
			final WebElement username = form.findElement (By.cssSelector ("#username"));
			username.click ();
			username.sendKeys (user);
		});

		When ("^Password as \"([^\"]*)\"$", (final String pwd) -> {
			final WebElement password = form.findElement (By.cssSelector ("#password"));
			password.click ();
			for (final char c : pwd.toCharArray ()) {
				password.sendKeys (Character.toString (c));
			}
		});

		Then ("^I should see message \"([^\"]*)\"$", (final String msg) -> {
			final WebElement loginbtn = form.findElement (By.cssSelector (".radius"));
			loginbtn.click ();

			final WebElement page2 = driver.findElement (By.cssSelector ("#flash"));
			final String pagetitle = page2.getText ();
			Assert.assertTrue (pagetitle.contains (msg));
		});
	}
}
