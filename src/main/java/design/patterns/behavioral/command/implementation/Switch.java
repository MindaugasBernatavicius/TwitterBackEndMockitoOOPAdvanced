package design.patterns.behavioral.command.implementation;

//invoker
public class Switch {

	public void storeAndExecute(Command command) {
		command.execute();
	}
}
