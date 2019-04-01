package eu.kinstaitis.registration;

public class OrderCalculator {

	int wed = 90;
	int phosh = 40;
	int event = 50;
	int order;
	int priceWed;
	int pricePhosh;
	int priceEvent;

	// summer
	// 1h 90eur wedings and
	// 1h 40eur photoshoot
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
