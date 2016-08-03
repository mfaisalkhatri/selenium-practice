package selenium.core.elements.impl;

import org.openqa.selenium.WebElement;

import selenium.core.elements.IHasBackingElement;

/**
 * @author Wasiq B
 * @since 31-Jul-2016 2:06:11 pm
 */
public class HasBackingElement implements IHasBackingElement {
	protected WebElement parent;

	/*
	 * (non-Javadoc)
	 * @see selenium.core.elements.IHasBackingElement#tag()
	 */
	@Override
	public WebElement parent () {
		return this.parent;
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.core.elements.IHasBackingElement#tag(org.openqa.selenium.
	 * WebElement)
	 */
	@Override
	public void parent (final WebElement element) {
		this.parent = element;
	}
}