public class Subscriber {
	public String name;

	public Subscriber(String userName) {
		this.name = userName;
	}

	public void uploadNotify(String def, String color) {
		System.out.println(
				"Achtung " + this.name + ", die Ampel wurde auf " + color + " gesetzt und das bedeutet: " + def);
	}

	private boolean subsctoAmpel(Ampel a) {
		return a.isSubscribed(this);
	}

	public void subscribe(Ampel a) {
		if (this.subsctoAmpel(a)) {
			System.out.println("already subscribed");
		} else {
			a.addSubscriber(this);
		}
	}

	public void unsubscribe(Ampel a) {
		if (this.subsctoAmpel(a)) {
			a.removeSubscriber(this);
			System.out.println("unsubscibing done");
		} else {
			System.out.println("not subscribed yet");
		}
	}
}
