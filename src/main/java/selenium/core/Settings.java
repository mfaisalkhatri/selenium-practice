package selenium.core;

/**
 * @author Wasiq B
 * @since 30-Jul-2016 12:32:58 pm
 */
public class Settings implements ISettings {
	private String	capturePath;
	private boolean	captureScreenOnFailure;

	/**
	 * @author Wasiq B
	 * @since 30-Jul-2016 12:32:58 pm
	 */
	public Settings () {
		this.capturePath = System.getProperty ("user.dir");
		this.captureScreenOnFailure = false;
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.core.ISettings#captureScreenOnVerificationFailure()
	 */
	@Override
	public boolean captureScreenOnVerificationFailure () {
		return this.captureScreenOnFailure;
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.core.ISettings#captureScreenOnVerificationFailure(boolean)
	 */
	@Override
	public void captureScreenOnVerificationFailure (final boolean value) {
		this.captureScreenOnFailure = value;
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.core.ISettings#screenCapturePath()
	 */
	@Override
	public String screenCapturePath () {
		return this.capturePath;
	}

	/*
	 * (non-Javadoc)
	 * @see selenium.core.ISettings#screenCapturePath(java.lang.String)
	 */
	@Override
	public void screenCapturePath (final String value) {
		this.capturePath = value;
	}
}