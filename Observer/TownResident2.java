package springobserver;

public class TownResident2 implements Observer {
	public void update(String messageText) {
		System.out.println("Greetings my name is: " + this);
		System.out.println("I heard: " + messageText);
	}

}
