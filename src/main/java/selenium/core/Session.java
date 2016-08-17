package selenium.core;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import selenium.core.driver.IDriverEnvironment;
import selenium.core.elements.IBlock;

/**
 * @author Wasiq B
 * @since 30-Jul-2016 12:31:13 pm
 */
public class Session {
	private WebDriver		driver;
	private final ISettings	settings;

	/**
	 * @author Wasiq B
	 * @since 30-Jul-2016 12:44:56 pm
	 * @param env
	 */
	public Session (final IDriverEnvironment env) {
		this (env, new Settings ());
	}

	/**
	 * @author Wasiq B
	 * @since 30-Jul-2016 12:43:40 pm
	 * @param env
	 * @param settings
	 */
	public Session (final IDriverEnvironment env, final ISettings settings) {
		this.driver = env.createDriver ();
		this.settings = settings;
	}

	/**
	 * @author Wasiq B
	 * @since 07-Aug-2016 2:46:31 pm
	 * @param nextClasses
	 * @return
	 */
//	public <T extends IBlock> T currentBlock () {
//		return this. <T>currentBlock (null);
//	}
	
	public <T extends IBlock> CurrentBlock <T> current (Class <T> target) {
		return new CurrentBlock <T> (this, null, target);
	}

	public <T extends IBlock> CurrentBlock <T> current (final WebElement parent, Class <T> target) {
		return new CurrentBlock <T> (this, parent, target);
	}

	/**
	 * @author Wasiq B
	 * @since 30-Jul-2016 2:07:07 pm
	 * @param parent
	 * @return
	 */
//	public <T extends IBlock> T currentBlock (final WebElement parent) {
//		CurrentBlock <T> block = new CurrentBlock <T> ();
//		return block.currentBlock (this, parent);
//	}

	/**
	 * @author Wasiq B
	 * @since 31-Jul-2016 2:53:44 pm
	 * @return
	 */
	public WebDriver driver () {
		return this.driver;
	}

	/**
	 * @author Wasiq B
	 * @since 31-Jul-2016 12:27:38 pm
	 */
	public void end () {
		if (this.driver != null) {
			this.driver.quit ();
			this.driver = null;
		}
	}

	/**
	 * @author Wasiq B
	 * @since 31-Jul-2016 12:46:26 pm
	 * @param script
	 * @param args
	 * @return
	 */
	@SuppressWarnings ("unchecked")
	public <T> T executeJavaScript (final String script, final Object... args) {
		return (T) ((JavascriptExecutor) this.driver).executeScript (script, args);
	}

	/**
	 * @author Wasiq B
	 * @since 05-Aug-2016 4:17:17 pm
	 * @return the settings
	 */
	public ISettings getSettings () {
		return this.settings;
	}

	/**
	 * @author Wasiq B
	 * @since 07-Aug-2016 2:55:31 pm
	 * @param url
	 * @param nextClasses
	 * @return
	 */
	public Session navigateTo (final String url) {
		this.driver.navigate ().to (url);
		return this;
	}
}