package custom_exception;

public class SpeedOutOfRangeException extends Exception {

	public SpeedOutOfRangeException(String detailMesg)
	{
		super(detailMesg);
	}
	
}