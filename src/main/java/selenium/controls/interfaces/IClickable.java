package selenium.controls.interfaces;

/**
 * @author wasiq.bhamla
 * @since Oct 18, 2016 12:28:00 PM
 */
public interface IClickable <T extends IContainer> extends IControl {
	/**
	 * @author wasiq.bhamla
	 * @since Oct 18, 2016 12:28:46 PM
	 */
	T click ();

	/**
	 * @author wasiq.bhamla
	 * @since Oct 18, 2016 12:29:00 PM
	 */
	T doubleClick ();

	/**
	 * @author wasiq.bhamla
	 * @since Oct 18, 2016 12:29:10 PM
	 */
	T contextClick ();
}
