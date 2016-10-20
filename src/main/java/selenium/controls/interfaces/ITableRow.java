package selenium.controls.interfaces;

import java.util.List;

/**
 * @author wasiq.bhamla
 * @since Oct 19, 2016 2:33:52 PM
 */
public interface ITableRow <TCol extends ITableColumn> extends IContainer {
	/**
	 * @author wasiq.bhamla
	 * @since Oct 19, 2016 2:35:01 PM
	 * @param index
	 * @return
	 */
	TCol column (int index);

	/**
	 * @author wasiq.bhamla
	 * @since Oct 19, 2016 2:35:35 PM
	 * @return
	 */
	List <TCol> columns ();
}