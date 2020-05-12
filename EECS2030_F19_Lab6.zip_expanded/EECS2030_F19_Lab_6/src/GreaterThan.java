
public class GreaterThan extends Expression {
	private boolean greaterthan;

	GreaterThan(int a, int b) {
		super(a, b);
		this.left = a;
		this.right = b;

		this.greaterthan = this.left > this.right ? true : false;
		this.value = this.greaterthan;

	}

	public Object getValue() {
		return this.value;
	}

	void evaluate() {
		this.greaterthan = this.left > this.right ? true : false;
		this.value = this.greaterthan;
	}
}
