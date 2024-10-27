package p1;

public interface Printable {
	// javac adds : public , static , final
	double TEST_DATA = 123.45;

//javac adds : public , abstract => specification
	void print(String mesg);
}
