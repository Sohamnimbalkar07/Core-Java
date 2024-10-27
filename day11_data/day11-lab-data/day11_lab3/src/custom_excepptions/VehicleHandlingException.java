package custom_excepptions;

@SuppressWarnings("serial")
public class VehicleHandlingException extends Exception {
	public VehicleHandlingException(String errMesg) {
		super(errMesg);
	}
}
