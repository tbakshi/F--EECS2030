
public class Subtraction extends Expression {

	private int difference;

	Subtraction(int a, int b) {
		super(a, b);
		this.left = a;
		this.right = b;
		this.difference = this.left - this.right;
		this.value = this.difference;
	}

	public Object getValue() {
		return this.value;
	}

	void evaluate() {
		this.difference = this.left - this.right;
		this.value = this.difference;
	}
}
