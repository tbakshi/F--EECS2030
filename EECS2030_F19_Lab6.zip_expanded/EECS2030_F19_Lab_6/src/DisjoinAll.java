
public class DisjoinAll extends ExpressionCollector {
	DisjoinAll() {
		super();
	}

	public Object getValue() {
		return this.value;
	}

	void evaluate() {
		Boolean result = false;
		for (Expression e : this.expressions) {
			e.evaluate();
			result |= (Boolean) e.getValue();
		}

		this.value = result;
	}
}
