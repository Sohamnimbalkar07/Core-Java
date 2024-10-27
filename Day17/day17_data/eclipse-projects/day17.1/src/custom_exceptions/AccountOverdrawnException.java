package custom_exceptions;

@SuppressWarnings("serial")
public class AccountOverdrawnException extends Exception {
	public AccountOverdrawnException(String mesg) {
		super(mesg);
	}

}
