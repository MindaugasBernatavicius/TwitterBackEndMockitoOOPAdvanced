package design.patterns.behavioral.visitor.good;

public class Wheel implements AtvPart {
	@Override
	public void accept(AtvPartVisitor visitor) {
		visitor.visit(this);
	}
}
