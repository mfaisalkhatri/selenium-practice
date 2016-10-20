package selenium.pages;

import org.openqa.selenium.By;

import selenium.controls.interfaces.impl.AbstractPage;
import selenium.pages.controls.NavigationBar;

/**
 * @author wasiq.bhamla
 * @since 19-Oct-2016 8:45:28 PM
 */
public class DashboardPage extends AbstractPage {
	/**
	 * @author wasiq.bhamla
	 * @since 19-Oct-2016 8:45:28 PM
	 */
	public DashboardPage () {
		super ();
	}

	/**
	 * @author wasiq.bhamla
	 * @since 19-Oct-2016 9:14:04 PM
	 * @return
	 */
	public NavigationBar <DashboardPage> sideBar () {
		return new NavigationBar <DashboardPage> (this, By.cssSelector (".menusubnav"), e -> new DashboardPage ());
	}
}