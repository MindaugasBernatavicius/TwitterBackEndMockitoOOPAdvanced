package design.patterns.behavioral.observer.implementation;

public class ObserverDemo {

	public static void main(String args[]) {
		Subject subject = new MessageStream();

		// clients will be the observers of the subject (the message stream)
		PhoneClient phoneClient = new PhoneClient(subject);
		TabletClient tabletClient = new TabletClient(subject);

		// we send messages from any of the clients and all clients are updated!
		phoneClient.addMessage("Here is a new message!");
		tabletClient.addMessage("Another new message!");
	}
	
}
