package eu.kinstaitis.registration.order;

import eu.kinstaitis.registration.event.EventType;
import java.util.Map;
import java.util.HashMap;

public class OrderCalculator {
	
	Map booking = new HashMap();

	int wed = 90;
	int phosh = 40;
	int event = 50;
	int order;
	int priceWed;
	int pricePhosh;
	int priceEvent;
	
	public double calcPrice(EventType type) {
		return priceEvent;

	}
	public int weding() {
		priceWed = order * wed;
		return priceWed;
	}

	public int photoshoot() {
		pricePhosh = order * phosh;
		return pricePhosh;
	}

	public int event() {
		priceEvent = order * event;
		return priceEvent;
	}
	

}
