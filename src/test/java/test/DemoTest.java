package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Wasiq B
 * @since 16-Jul-2016 3:28:09 pm
 */
public class DemoTest extends BaseSeleniumTest {
	@Test
	public void testLink () {
		final WebElement reg = driver.findElement (By.cssSelector ("#menu-item-374>a"));
		reg.click ();
		final WebDriverWait w = new WebDriverWait (driver, 10);
		w.until (ExpectedConditions.titleContains ("Registration"));
		Assert.assertEquals (driver.getTitle (), "Registration");
	}
}
