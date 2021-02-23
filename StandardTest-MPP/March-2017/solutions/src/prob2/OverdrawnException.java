package prob2;

@SuppressWarnings("serial")
public class OverdrawnException extends Exception {
	public OverdrawnException() {
		super();
	}
	public OverdrawnException(String s) {
		super(s);
	}
	public OverdrawnException(Throwable t) {
		super(t);
	}
}
