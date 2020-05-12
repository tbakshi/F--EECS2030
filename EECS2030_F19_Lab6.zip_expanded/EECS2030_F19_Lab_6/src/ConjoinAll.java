
public class ConjoinAll extends ExpressionCollector {
	ConjoinAll() {
		super();
	}

	public Object getValue() {
		return this.value;
	}

	void evaluate() {
		Boolean result = true;
		for (Expression e : this.expressions) {
			e.evaluate();
			result &= (Boolean) e.getValue();
		}

		this.value = result;
	}
}
