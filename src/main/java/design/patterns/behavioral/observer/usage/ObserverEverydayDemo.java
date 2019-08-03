package design.patterns.behavioral.observer.usage;

import java.util.Observable;
import java.util.Observer;

public class ObserverEverydayDemo {

	public static void main(String args[]) {
		TwitterStream messageStream = new TwitterStream();
		
		Client client1 = new Client("Bryan");
		Client client2 = new Client("Mark");
		// How can we extend this example?
		// 1. Add another client of the same type
		Client client3 = new Client("Mindaugas");

		// 2. Add another type of client
		B2BClient facebook = new B2BClient("Facebook");
		
		messageStream.addObserver(client1);
		messageStream.addObserver(client2);
		messageStream.addObserver(client3);
		messageStream.addObserver(facebook);
		
		messageStream.someoneTweeted();
	}
}

// concrete subject
class TwitterStream extends Observable {
	public void someoneTweeted() {
		setChanged();
		notifyObservers();
	}
}

//concrete observer
class Client implements Observer {
	private String name;

	Client(String name) {
		this.name = name;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Update " + name + "'s stream, someone tweeted something.");
	}
}

class B2BClient implements Observer {
	private String name;

	B2BClient(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("The API of the " + name + " client was called");
	}
}