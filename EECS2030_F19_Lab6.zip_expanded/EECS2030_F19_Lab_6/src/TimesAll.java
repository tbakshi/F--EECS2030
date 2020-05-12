
public class TimesAll extends ExpressionCollector {
	TimesAll() {
		super();
	}

	public Object getValue() {
		return this.value;
	}

	void evaluate() {
		Integer result = 1;
		for (Expression e : this.expressions) {
			e.evaluate();
			result *= (Integer) e.getValue();
		}

		this.value = result;
	}
}
