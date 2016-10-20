package selenium.pages.controls;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.openqa.selenium.By;

import selenium.controls.interfaces.IClickable;
import selenium.controls.interfaces.IContainer;
import selenium.controls.interfaces.impl.AbstractControl;
import selenium.controls.interfaces.impl.Clickable;

/**
 * @author wasiq.bhamla
 * @since 19-Oct-2016 9:03:15 PM
 */
public class NavigationBar <T extends IContainer> extends AbstractControl <IClickable <T>, T> {
	private final List <IClickable <T>> links;

	/**
	 * @author wasiq.bhamla
	 * @since 19-Oct-2016 9:03:52 PM
	 * @param parentContainer
	 * @param locator
	 */
	public NavigationBar (final IContainer parentContainer, final By locator, final Function <IClickable <T>, T> target) {
		super (parentContainer, locator, target);
		this.links = finds (By.cssSelector ("li>a")).stream ().filter (e -> e.isDisplayed ()).map (e -> new Clickable <T> (this, e, this.target))
				.collect (Collectors.toList ());
	}

	/**
	 * @author wasiq.bhamla
	 * @since 19-Oct-2016 9:10:21 PM
	 * @param text
	 * @return
	 */
	public IClickable <T> link (final String text) {
		return this.links.stream ().filter (e -> e.text ().equals (text)).findFirst ().get ();
	}
}
