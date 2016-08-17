package selenium.core.pages;

import java.util.List;
import java.util.stream.Collectors;

import javax.naming.OperationNotSupportedException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium.core.Session;
import selenium.core.elements.IBlock;
import selenium.core.elements.IClickable;
import selenium.core.elements.impl.Clickable;
import selenium.core.elements.impl.WebBlock;

/**
 * @author Wasiq B
 * @since 06-Aug-2016 9:40:39 pm
 */
public class InternetPage extends WebBlock {
	/**
	 * @author Wasiq B
	 * @since 06-Aug-2016 9:40:41 pm
	 * @param session
	 */
	public InternetPage (final Session session) {
		super (session);
		try {
			parent (findElement (By.cssSelector ("#content")));
		}
		catch (final OperationNotSupportedException e) {
			e.printStackTrace ();
		}
	}

	/**
	 * @author Wasiq B
	 * @since 06-Aug-2016 9:59:12 pm
	 * @param label
	 * @return
	 * @throws OperationNotSupportedException
	 */
	public <T extends IBlock> IClickable <T> label (final String label) throws OperationNotSupportedException {
		List <WebElement> list = findElements (By.cssSelector ("ul li a"));
		List <IClickable <T>> labels = list.stream ()
				.filter (l -> l.getText ().equals (label))
				.map (c -> new Clickable <T> (this, c))
				.collect (Collectors.toList ());
		return labels.get (0);
	}
}