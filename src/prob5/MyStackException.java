package prob5;

public class MyStackException extends Exception {

	public MyStackException() {
		super("stack is empty");
	}
	public MyStackException(String mes) {
		super(mes);
	}
}
