package selenium.controls.interfaces;

/**
 * @author wasiq.bhamla
 * @since Oct 18, 2016 12:31:09 PM
 */
public interface ICheckBox <T extends IContainer> extends IControl {
	/**
	 * @author wasiq.bhamla
	 * @since Oct 18, 2016 12:32:18 PM
	 */
	T check ();

	/**
	 * @author wasiq.bhamla
	 * @since Oct 18, 2016 12:32:24 PM
	 */
	T toggle ();

	/**
	 * @author wasiq.bhamla
	 * @since Oct 18, 2016 12:32:22 PM
	 */
	T uncheck ();
}