
public class LessThan extends Expression {
	private boolean lessthan;

	LessThan(int a, int b) {
		super(a, b);
		this.left = a;
		this.right = b;

		this.lessthan = this.left < this.right ? true : false;
		this.value = this.lessthan;

	}

	public Object getValue() {
		return this.value;
	}

	void evaluate() {
		this.lessthan = this.left < this.right ? true : false;
		this.value = this.lessthan;
	}
}
