package design.patterns.behavioral.chainofresp.implementation;

public class ChainOfResponsibilityDemo {

	public static void main(String[] args) {
		Director bryan = new Director();
		VP crystal = new VP();
		CEO jeff = new CEO();

		// handlers are added at the client level, we could change that but at cost of flexibility
        // reimplemented in the spirit of fluent api principle
		bryan.setSuccessor(crystal).setSuccessor(jeff);
		// crystal.setSuccessor(jeff);
		
		Request request = new Request(RequestType.CONFERENCE, 500);
		bryan.handleRequest(request);
		
		request = new Request(RequestType.PURCHASE, 1000);
		crystal.handleRequest(request);

		// most importantly for Chain or responsibility
		request = new Request(RequestType.PURCHASE, 2000);
		bryan.handleRequest(request);
	}
}
