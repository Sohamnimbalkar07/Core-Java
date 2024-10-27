package custom_exceptions;

@SuppressWarnings("serial") // to tell javac to suppress : serialization related warnings (covered later)
public class SpeedOutOfRangeException extends Exception {
	public SpeedOutOfRangeException(String errMesg) {
		super(errMesg);
	}
}
