package non_generic;

public class Holder {
//add state : which can refer to ANY primitive type or ref type
	private Object reference;
	// constr

	public Holder(Object reference) {
		super();
		this.reference = reference;
	}
	// getter

	public Object getReference() {
		return reference;
	}

}
