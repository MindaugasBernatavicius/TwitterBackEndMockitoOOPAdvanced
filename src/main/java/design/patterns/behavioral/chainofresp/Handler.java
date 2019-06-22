package design.patterns.behavioral.chainofresp;

public abstract class Handler {

	protected Handler successor;
	
	public Handler setSuccessor(Handler successor) {
		this.successor = successor;
		return this;
	}
	
	public abstract void handleRequest(Request request);
	
}
