package selenium.core;

import org.openqa.selenium.Keys;

/**
 * @author Wasiq B
 * @since 26-Jul-2016 6:03:23 pm
 */
public class Key {
	/**
	 * @author Wasiq B
	 * @since 29-Jul-2016 7:49:50 pm
	 */
	public static class Alphabets {
		public static final Key	A	= new Key ("a", "A");
		public static final Key	B	= new Key ("b", "B");
		public static final Key	C	= new Key ("c", "C");
		public static final Key	D	= new Key ("d", "D");
		public static final Key	E	= new Key ("e", "E");
		public static final Key	F	= new Key ("f", "F");
		public static final Key	G	= new Key ("g", "G");
		public static final Key	H	= new Key ("h", "H");
		public static final Key	I	= new Key ("i", "I");
		public static final Key	J	= new Key ("j", "J");
		public static final Key	K	= new Key ("k", "K");
		public static final Key	L	= new Key ("l", "L");
		public static final Key	M	= new Key ("m", "M");
		public static final Key	N	= new Key ("n", "N");
		public static final Key	O	= new Key ("o", "O");
		public static final Key	P	= new Key ("p", "P");
		public static final Key	Q	= new Key ("q", "Q");
		public static final Key	R	= new Key ("r", "R");
		public static final Key	S	= new Key ("s", "S");
		public static final Key	T	= new Key ("t", "T");
		public static final Key	U	= new Key ("u", "U");
		public static final Key	V	= new Key ("v", "V");
		public static final Key	W	= new Key ("w", "W");
		public static final Key	X	= new Key ("x", "X");
		public static final Key	Y	= new Key ("y", "Y");
		public static final Key	Z	= new Key ("z", "Z");
	}

	/**
	 * @author Wasiq B
	 * @since 28-Jul-2016 7:22:01 pm
	 */
	public static class Arrows {
		public static final Key	DOWN	= new Key (Keys.DOWN, "Down");
		public static final Key	LEFT	= new Key (Keys.LEFT, "Left");
		public static final Key	RIGHT	= new Key (Keys.RIGHT, "Right");
		public static final Key	UP		= new Key (Keys.UP, "Up");
	}

	/**
	 * @author Wasiq B
	 * @since 29-Jul-2016 7:48:47 pm
	 */
	public static class Digits {
		public static final Key	D0	= new Key ("0", "0");
		public static final Key	D1	= new Key ("1", "1");
		public static final Key	D2	= new Key ("2", "2");
		public static final Key	D3	= new Key ("3", "3");
		public static final Key	D4	= new Key ("4", "4");
		public static final Key	D5	= new Key ("5", "5");
		public static final Key	D6	= new Key ("6", "6");
		public static final Key	D7	= new Key ("7", "7");
		public static final Key	D8	= new Key ("8", "8");
		public static final Key	D9	= new Key ("9", "9");
	}

	/**
	 * @author Wasiq B
	 * @since 28-Jul-2016 7:25:57 pm
	 */
	public static class Function {
		public static final Key	F1	= new Key (Keys.F1, "F1");
		public static final Key	F10	= new Key (Keys.F10, "F10");
		public static final Key	F11	= new Key (Keys.F11, "F11");
		public static final Key	F12	= new Key (Keys.F12, "F12");
		public static final Key	F2	= new Key (Keys.F2, "F2");
		public static final Key	F3	= new Key (Keys.F3, "F3");
		public static final Key	F4	= new Key (Keys.F4, "F4");
		public static final Key	F5	= new Key (Keys.F5, "F5");
		public static final Key	F6	= new Key (Keys.F6, "F6");
		public static final Key	F7	= new Key (Keys.F7, "F7");
		public static final Key	F8	= new Key (Keys.F8, "F8");
		public static final Key	F9	= new Key (Keys.F9, "F9");
	}

	/**
	 * @author Wasiq B
	 * @since 28-Jul-2016 7:26:35 pm
	 */
	public static class Numpad {
		public static final Key	ADD			= new Key (Keys.ADD, "Add");
		public static final Key	DECIMAL		= new Key (Keys.DECIMAL, "Decimal");
		public static final Key	DIVIDE		= new Key (Keys.DIVIDE, "Divide");
		public static final Key	MULTIPLY	= new Key (Keys.MULTIPLY, "Multiply");
		public static final Key	NUM_0		= new Key (Keys.NUMPAD0, "Numpad0");
		public static final Key	NUM_1		= new Key (Keys.NUMPAD1, "Numpad1");
		public static final Key	NUM_2		= new Key (Keys.NUMPAD2, "Numpad2");
		public static final Key	NUM_3		= new Key (Keys.NUMPAD3, "Numpad3");
		public static final Key	NUM_4		= new Key (Keys.NUMPAD4, "Numpad4");
		public static final Key	NUM_5		= new Key (Keys.NUMPAD5, "Numpad5");
		public static final Key	NUM_6		= new Key (Keys.NUMPAD6, "Numpad6");
		public static final Key	NUM_7		= new Key (Keys.NUMPAD7, "Numpad7");
		public static final Key	NUM_8		= new Key (Keys.NUMPAD8, "Numpad8");
		public static final Key	NUM_9		= new Key (Keys.NUMPAD9, "Numpad9");
		public static final Key	SUBTRACT	= new Key (Keys.SUBTRACT, "Subtract");
	}

	/**
	 * @author Wasiq B
	 * @since 28-Jul-2016 7:21:56 pm
	 */
	public static class Others {
		public static final Key	BREAK		= new Key (Keys.CANCEL, "Break");
		public static final Key	DELETE		= new Key (Keys.DELETE, "Delete");
		public static final Key	END			= new Key (Keys.END, "End");
		public static final Key	HELP		= new Key (Keys.HELP, "Help");
		public static final Key	HOME		= new Key (Keys.HOME, "Home");
		public static final Key	INSERT		= new Key (Keys.INSERT, "Insert");
		public static final Key	PAGE_DOWN	= new Key (Keys.PAGE_DOWN, "PageDown");
		public static final Key	PAGE_UP		= new Key (Keys.PAGE_UP, "PageUp");
		public static final Key	PAUSE		= new Key (Keys.PAUSE, "Pause");
	}

	public static final Key	ALT				= new Key (Keys.ALT, "Alt");
	public static final Key	ALT_LEFT		= new Key (Keys.LEFT_ALT, "LeftAlt");
	public static final Key	BACK_SPACE		= new Key (Keys.BACK_SPACE, "Backspace");
	public static final Key	COMMAND			= new Key (Keys.COMMAND, "Command");
	public static final Key	CONTROL			= new Key (Keys.CONTROL, "Ctrl");
	public static final Key	CONTROL_LEFT	= new Key (Keys.LEFT_CONTROL, "LeftCtrl");
	public static final Key	ENTER			= new Key (Keys.ENTER, "Enter");
	public static final Key	ESC				= new Key (Keys.ESCAPE, "Esc");
	public static final Key	RETURN			= new Key (Keys.RETURN, "Return");
	public static final Key	SHIFT			= new Key (Keys.SHIFT, "Shift");
	public static final Key	SHIFT_LEFT		= new Key (Keys.LEFT_SHIFT, "LeftShift");
	public static final Key	SPACE			= new Key (Keys.SPACE, "Space");
	public static final Key	TAB				= new Key (Keys.TAB, "Tab");

	private final String	alias;
	private final String	key;

	/**
	 * @author Wasiq B
	 * @since 27-Jul-2016 9:48:32 pm
	 * @param key
	 * @param alias
	 */
	public Key (final Keys key, final String alias) {
		this (key.toString (), alias);
	}

	/**
	 * @author Wasiq B
	 * @since 27-Jul-2016 9:32:34 pm
	 */
	public Key (final String key, final String alias) {
		this.key = key;
		this.alias = alias;
	}

	public boolean equals (final Key obj) {
		// TODO Auto-generated method stub
		return super.equals (obj);
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals (final Object obj) {
		// TODO Auto-generated method stub
		return super.equals (obj);
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode () {
		return this.key != null ? this.key.hashCode () : 0;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString () {
		return this.alias;
	}

	/**
	 * @author Wasiq B
	 * @since 27-Jul-2016 9:49:13 pm
	 * @return
	 */
	public String value () {
		return this.key;
	}
}