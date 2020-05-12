
public class Equal extends Expression {
	private boolean equal;

	Equal(int a, int b) {
		super(a, b);
		this.left = a;
		this.right = b;

		this.equal = this.left == this.right ? true : false;
		this.value = this.equal;
	}

	void evaluate() {
		this.equal = this.left == this.right ? true : false;
		this.value = this.equal;
	}

	public Object getValue() {
		return this.value;
	}
}
