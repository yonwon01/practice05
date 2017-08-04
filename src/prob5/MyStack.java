package prob5;

public class MyStack {

	private String[] buffer = null;
	int top = -1;
	
	public MyStack(int capacity) {
		

		this.buffer = new String[capacity];
	}

	void push(String s) {
		if (this.top == this.buffer.length - 1) {
			// overflow->stack늘리기

			resize();
		} else {
			top++;
			this.buffer[top] = s;
		}
	}

	void resize() {
		String temp[] = new String[this.buffer.length*2];
		for (int i = 0; i < this.buffer.length; i++) {
			temp[i] = buffer[i];
			
		}
		buffer = temp;
	}

	String pop() throws MyStackException {
		if (top < 0) {
			throw new MyStackException();
		} else {
			// System.out.println(top);
			String tmp = buffer[top];
			this.buffer[top] = null;
			top--;
			return tmp;
		}
	}

	Boolean isEmpty() {
		if (this.top < 0) {
			return true;
		}
		return false;

	}
}
