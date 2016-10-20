package selenium.controls.interfaces;

import java.util.List;

/**
 * @author wasiq.bhamla
 * @since Oct 18, 2016 12:41:14 PM
 */
public interface ISelectBox extends IControl {
	/**
	 * @author wasiq.bhamla
	 * @since Oct 18, 2016 12:41:47 PM
	 * @return
	 */
	List <IOption> options ();
}