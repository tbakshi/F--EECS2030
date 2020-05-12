
public class AddAll extends ExpressionCollector {
	AddAll() {
		super();
	}

	public Object getValue() {
		return this.value;
	}

	void evaluate() {
		Integer sum = 0;
		for (Expression e : this.expressions) {
			e.evaluate();
			sum += (Integer) e.getValue();
		}

		this.value = sum;
	}

}
