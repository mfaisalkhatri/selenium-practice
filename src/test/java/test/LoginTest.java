package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Wasiq B
 * @since 23-Jul-2016 6:37:09 pm
 */
public class LoginTest extends BaseSeleniumTest {
	private String style = null;

	private void highlight (final WebElement element) throws InterruptedException {
		this.style = element.getAttribute ("style");
		final JavascriptExecutor js = (JavascriptExecutor) driver;
		if (js != null) {
			js.executeScript ("arguments[0].setAttribute('style', arguments[1]);", element, "color: red; border: 3px solid red;");
			Thread.sleep (200);
		}
	}

	private void unhighlight (final WebElement element) {
		final JavascriptExecutor js = (JavascriptExecutor) driver;
		if (js != null) js.executeScript ("arguments[0].setAttribute('style', arguments[1]);", element, this.style);
	}

	@Test
	public void testHappyPath () throws InterruptedException {
		final WebElement form = driver.findElement (By.cssSelector ("#login"));
		final WebElement username = form.findElement (By.cssSelector ("#username"));
		highlight (username);
		unhighlight (username);
		username.click ();
		username.sendKeys ("tomsmith");

		final WebElement password = form.findElement (By.cssSelector ("#password"));
		highlight (password);
		unhighlight (password);
		password.click ();
		final String pwd = "SuperSecretPassword!";
		for (final char c : pwd.toCharArray ()) {
			password.sendKeys (Character.toString (c));
		}

		final WebElement loginbtn = form.findElement (By.cssSelector (".radius"));
		highlight (loginbtn);
		unhighlight (loginbtn);
		loginbtn.click ();

		final WebElement page2 = driver.findElement (By.cssSelector ("#flash"));
		final String pagetitle = page2.getText ();

		Assert.assertTrue (pagetitle.contains ("You logged into a secure area!"));

		final WebElement logout = driver.findElement (By.cssSelector (".button.secondary.radius"));
		highlight (logout);
		unhighlight (logout);
		logout.click ();

	}

	@Test
	public void testsadPath () {
		final WebElement form = driver.findElement (By.cssSelector ("#login"));
		final WebElement username = form.findElement (By.cssSelector ("#username"));
		username.click ();
		username.sendKeys ("tomsmith");

		final WebElement password = form.findElement (By.cssSelector ("#password"));
		password.click ();
		password.sendKeys ("Super");

		final WebElement loginbtn = form.findElement (By.cssSelector (".radius"));
		loginbtn.sendKeys (Keys.ENTER);

		// final WebElement loginbtn = form.findElement (By.cssSelector
		// (".radius"));
		// loginbtn.click ();
		final WebElement page2 = driver.findElement (By.cssSelector ("#flash"));
		final String pagetitle = page2.getText ();

		Assert.assertTrue (pagetitle.contains ("Your password is invalid!"));
	}

}
