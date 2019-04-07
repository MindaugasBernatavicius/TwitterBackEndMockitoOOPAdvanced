package design.patterns.structural.bridge.shape2;

public abstract class Shape {

	// fact that Shape uses color through compossition
    // is the bridge - the bridge is not a concrete class
    // but rather the usage of some abstract class inside
    // of another abstract class or interface
	protected Color color;
	
	public Shape(Color color) {
		this.color = color;
	}
	
	abstract public void applyColor();
}
