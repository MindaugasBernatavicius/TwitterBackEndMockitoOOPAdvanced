package design.patterns.structural.decorator;

public class SaladDecorator extends SandwichDecorator {

	public SaladDecorator(Sandwich customSandwich) {
		super(customSandwich);
	}

	public String make() {
		return customSandwich.make() + addSalad();
	}

	private String addSalad() {
		return " + salad";
	}
}
