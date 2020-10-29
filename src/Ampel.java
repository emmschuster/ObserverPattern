import java.util.ArrayList;
import java.util.List;

public class Ampel {
	public String color;
	public String name;
	private String def;
	private List<Subscriber> subscribers = new ArrayList<>();

	public Ampel(String ort) {
		//this.color = farbe;
		this.name = ort;
		//update(farbe);
	}

	public boolean isSubscribed(Subscriber sub) {
		return this.subscribers.contains(sub);
	}

	public void addSubscriber(Subscriber sub) {
		this.subscribers.add(sub);
	}

	public void removeSubscriber(Subscriber sub) {
		this.subscribers.remove(sub);
	}

	public void update(String farbe) {
		this.color=farbe;
		if (color == "orange") {
			this.def="ok";
		}
		if (color == "green") {
			this.def="perfect";
		}
		if (color == "yellow") {
			this.def="shit";
		}
		if (color == "red") {
			this.def="holy shit";
		}
		for (int i = 0; i < subscribers.size(); i++) {
			subscribers.get(i).uploadNotify(this.def, this.color);
		}
	}
}
