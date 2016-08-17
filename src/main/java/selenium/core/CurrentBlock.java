package selenium.core;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import selenium.core.elements.IBlock;
import selenium.core.elements.ISpecificBlock;

/**
 * @author wasiq.bhamla
 * @since 10-Aug-2016 10:20:11 PM
 */
public class CurrentBlock <T extends IBlock> {
	private final Class <T> cls;
	private final Session session;
	private final WebElement parent;
	
	/**
	 * @author wasiq.bhamla
	 * @since 10-Aug-2016 10:24:52 PM
	 */
	public CurrentBlock (Session session, WebElement parent, Class <T> target) {
		this.session = session;
		this.parent = parent;
		this.cls = target;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 10-Aug-2016 10:24:57 PM
	 * @param session
	 * @param parent
	 * @return
	 */
	public T currentBlock () {
		List <Class <?>> types = new ArrayList <Class <?>> ();
		types.add (Session.class);
		List <Object> args = new ArrayList <Object> ();
		args.add (this.session);
		if (ISpecificBlock.class.isAssignableFrom (this.cls)) {
			types.add (WebElement.class);
			args.add (this.parent);
		}
		Class <?> [] params = new Class <?> [types.size ()];
		Constructor <T> ctor;
		try {
			ctor = this.cls.getConstructor (types.toArray (params));
			return ctor.newInstance (args.toArray ());
		}
		catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace ();
		}
		return null;
	}
}
