package custom_exceptions;

@SuppressWarnings("serial")
public class DupAccountException extends Exception {
	public DupAccountException(String mesg) {
		super(mesg);
	}

}
