package design.patterns.behavioral.visitor.good;

public class VisitorDemo {

	public static void main(String[] args) {
		PartsOrder order = new PartsOrder();
		order.addPart(new Wheel());
		order.addPart(new Fender());
		order.addPart(new Oil());
		
		order.accept(new AtvPartsShippingVisitor());
		order.accept(new AtvPartsDisplayVisitor());
	}
}
