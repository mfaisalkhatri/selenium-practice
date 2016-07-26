package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Wasiq B
 * @since 16-Jul-2016 3:28:09 pm
 */
public class DemoTest extends BaseSeleniumTest {
	@Test (priority = 2, enabled = false)
	public void testEntry () {
		final WebElement form = driver.findElement (By.cssSelector ("#pie_regiser_form"));
		WebElement firstName = form.findElement (By.cssSelector ("#name_3_firstname"));
		String act = firstName.getText ();
		firstName.sendKeys ("Faisal");
		act = firstName.getText ();
		final WebElement lastName = form.findElement (By.cssSelector ("#name_3_lastname"));
		lastName.click ();
		firstName = form.findElement (By.cssSelector ("#name_3_firstname"));
		act = firstName.getText ();
		Assert.assertEquals (act, "Faisal");
	}

	@Test (priority = 1, enabled = false)
	public void testLink () {
		final WebElement reg = driver.findElement (By.cssSelector ("#menu-item-374>a"));
		reg.click ();
		wait.until (ExpectedConditions.titleContains ("Registration"));
		Assert.assertEquals (driver.getTitle (), "Registration | Demoqa");
	}
}
