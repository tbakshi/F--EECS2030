
public class Addition extends Expression {
	private int result;

	Addition(int a, int b) {
		super(a, b);
		this.left = a;
		this.right = b;
		this.result = this.left + this.right;
		this.value = this.result;
	}

	public Object getValue() {
		return this.value;
	}

	void evaluate() {
		this.result = this.left + this.right;
		this.value = this.result;
	}
}
