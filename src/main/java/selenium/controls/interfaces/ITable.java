package selenium.controls.interfaces;

import java.util.List;

/**
 * @author wasiq.bhamla
 * @since Oct 19, 2016 2:36:13 PM
 */
public interface ITable <TCol extends ITableColumn> extends IContainer {
	/**
	 * @author wasiq.bhamla
	 * @since Oct 19, 2016 2:37:09 PM
	 * @param index
	 * @return
	 */
	ITableRow <TCol> row (int index);

	/**
	 * @author wasiq.bhamla
	 * @since Oct 19, 2016 2:37:41 PM
	 * @return
	 */
	List <ITableRow <TCol>> rows ();
}