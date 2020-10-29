public class AmpelMain {

	public static void main(String[] args) {
		Subscriber s1 = new Subscriber("peter");
		Subscriber s2 = new Subscriber("marie");
		
		Ampel a = new Ampel("Tirol");
		
		s1.subscribe(a);
		s2.subscribe(a);
		
		a.update("yellow");
		
		s2.unsubscribe(a);
		
		a.update("red");
		
	}

}
