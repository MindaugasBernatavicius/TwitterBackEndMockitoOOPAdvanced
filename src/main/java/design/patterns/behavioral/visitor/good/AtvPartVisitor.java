package design.patterns.behavioral.visitor.good;

public interface AtvPartVisitor {
	void visit(Wheel wheel);
	void visit(Fender fender);
	void visit(Oil oil);
	void visit(PartsOrder partsOrder);
}
