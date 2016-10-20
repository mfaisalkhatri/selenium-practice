package selenium.controls.interfaces.impl;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import selenium.controls.interfaces.ICheckBox;
import selenium.controls.interfaces.IClickable;
import selenium.controls.interfaces.IContainer;

/**
 * @author wasiq.bhamla
 * @since 18-Oct-2016 9:30:47 PM
 */
public class CheckBox <T extends IContainer> extends Clickable <T> implements ICheckBox <T> {
	/**
	 * @author wasiq.bhamla
	 * @since 18-Oct-2016 9:30:47 PM
	 * @param parentContainer
	 * @param locator
	 */
	public CheckBox (final IContainer parentContainer, final By locator, Function <IClickable <T>, T> target) {
		super (parentContainer, locator, target);
	}

	/**
	 * @author wasiq.bhamla
	 * @since 18-Oct-2016 9:30:47 PM
	 * @param parentContainer
	 * @param parent
	 */
	public CheckBox (final IContainer parentContainer, final WebElement parent, Function <IClickable <T>, T> target) {
		super (parentContainer, parent, target);
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.CheckBox#check()
	 */
	@Override
	public T check () {
		if (!selected ()) {
			return click ();
		}
		return this.target.apply (this);
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.CheckBox#toggle()
	 */
	@Override
	public T toggle () {
		return click ();
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.controls.interfaces.CheckBox#uncheck()
	 */
	@Override
	public T uncheck () {
		if (selected ()) {
			return click ();
		}
		return this.target.apply (this);
	}
}