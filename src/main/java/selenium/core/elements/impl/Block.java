package selenium.core.elements.impl;

import java.util.List;

import javax.naming.OperationNotSupportedException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium.core.Session;
import selenium.core.elements.IBlock;
import selenium.core.elements.IPerformDragDrop;

/**
 * @author Wasiq B
 * @since 31-Jul-2016 2:04:26 pm
 */
public class Block extends HasBackingElement implements IBlock {
	protected final Session session;

	/**
	 * @author Wasiq B
	 * @since 31-Jul-2016 2:52:37 pm
	 * @param session
	 */
	public Block (final Session session) {
		this.session = session;
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.core.elements.IDraggable#dragDropPerformer()
	 */
	@Override
	public IPerformDragDrop dragDropPerformer () {
		return new WebDragAndDropPerformer (this.session.driver ());
	}

	/**
	 * @author Wasiq B
	 * @since 31-Jul-2016 2:55:56 pm
	 * @param locator
	 * @return
	 * @throws OperationNotSupportedException
	 */
	public WebElement findElement (final By locator) throws OperationNotSupportedException {
		if (parent () == null) throw new OperationNotSupportedException ("Parent cannot be null");
		return parent ().findElement (locator);
	}

	/**
	 * @author Wasiq B
	 * @since 31-Jul-2016 2:56:51 pm
	 * @param locator
	 * @return
	 * @throws OperationNotSupportedException
	 */
	public List <WebElement> findElements (final By locator) throws OperationNotSupportedException {
		if (parent () == null) throw new OperationNotSupportedException ("Parent cannot be null");
		return parent ().findElements (locator);
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.core.elements.IHasSession#session()
	 */
	@Override
	public Session session () {
		return this.session;
	}
}