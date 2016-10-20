package selenium.controls.interfaces;

import java.util.List;

/**
 * @author wasiq.bhamla
 * @since Oct 18, 2016 12:43:23 PM
 */
public interface IRadioButton <T extends IContainer> {
	/**
	 * @author wasiq.bhamla
	 * @since Oct 18, 2016 12:43:50 PM
	 * @return
	 */
	List <IOption <T>> options ();
}