package selenium.core;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;

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
	 * @since 31-Jul-2016 12:25:41 pm
	 * @return
	 */
	public <T extends IBlock> T currentBlock () {
		return currentBlock (null);
	}

	/**
	 * @author Wasiq B
	 * @since 30-Jul-2016 2:07:07 pm
	 * @param parent
	 * @return
	 */
	@SuppressWarnings ("unchecked")
	public <T extends IBlock> T currentBlock (final WebElement parent) {
		T ret = null;
		try {
			final ParameterizedType type = (ParameterizedType) getClass ().getGenericSuperclass ();
			final Class <T> cls = (Class <T>) type.getActualTypeArguments () [0];
			Constructor <T> ctor = null;
			if (parent != null) {
				ctor = cls.getConstructor (WebElement.class);
				if (ctor != null) {
					ret = ctor.newInstance (parent);
				}
			}
			else {
				ctor = cls.getConstructor ();
				if (ctor != null) {
					ret = ctor.newInstance ();
				}
			}
		}
		catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException |
				InvocationTargetException e) {
			e.printStackTrace ();
		}
		return ret;
	}

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
	 * @since 30-Jul-2016 1:04:42 pm
	 * @param url
	 * @return
	 */
	public <T extends IBlock> T navigateTo (final String url) {
		this.driver.navigate ().to (url);
		return currentBlock ();
	}
}