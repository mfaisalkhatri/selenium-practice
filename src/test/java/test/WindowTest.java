package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Wasiq B
 * @since 06-Aug-2016 4:08:47 pm
 */
public class WindowTest extends BaseSeleniumTest {
	@Test
	public void testFrames () {
		WebElement frame = driver.findElement (By.name ("frame-top"));
		driver.switchTo ().frame (frame);
		WebElement f1 = driver.findElement (By.name ("frame-left"));
		driver.switchTo ().frame (f1);
		WebElement body = driver.findElement (By.tagName ("body"));
		Assert.assertEquals (body.getText (), "LEFT");
	}
	
	@Test (enabled = false)
	public void testCheckbox () {
		WebElement form = driver.findElement (By.id ("checkboxes"));
		if (form == null) Assert.fail ("Form cannot be null.");
		List <WebElement> chks = form.findElements (By.cssSelector ("input"));
		for (WebElement chk : chks) {
			String txt = chk.getText ();
			System.out.println (txt);
//			if (!chk.isSelected ()) {
				chk.click ();
//			}
		}
		System.out.println ();
	}
	
	
	@Test (enabled = false)
	public void testWindow () throws InterruptedException {
		final WebElement click = driver.findElement (By.cssSelector (".example>a"));
		click.click ();

		final Actions action = new Actions (driver);
		action.moveToElement (click).doubleClick (click).build ().perform ();
		action.clickAndHold (click).build ().perform ();
		Thread.sleep (1000);
		action.release (click).build ().perform ();

		final WebElement text = driver.findElement (By.cssSelector (".example>h3"));

		Assert.assertEquals (text.getText (), "New Window", "Text");
	}
}