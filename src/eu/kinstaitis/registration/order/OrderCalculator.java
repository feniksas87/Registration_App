package eu.kinstaitis.registration.order;

import java.util.HashMap;
import java.util.Map;

import eu.kinstaitis.registration.pojo.EventType;

public class OrderCalculator {

	private Map<EventType, Double> prices = new HashMap<>();

	public OrderCalculator() {

		prices.put(EventType.Wedding, 1000.0);
		prices.put(EventType.Christening, 600.0);
		prices.put(EventType.GivingAname, 600.0);
		prices.put(EventType.Party, 200.0);
		prices.put(EventType.Conference, 100.0);
		prices.put(EventType.Concert, 200.0);
		prices.put(EventType.Photoshoot, 160.0);
		prices.put(EventType.ModelPortfolio, 100.0);
		prices.put(EventType.Event, 300.0);
		prices.put(EventType.SportEvent, 500.0);
		prices.put(EventType.Animals, 300.0);
		prices.put(EventType.Commercial, 1000.0);
		prices.put(EventType.Jewelry, 1000.0);
		prices.put(EventType.Interior, 1000.0);
		prices.put(EventType.Other, 1000.0);

	}

	public double calcPrice(EventType type) {

		return prices.get(type);
	}

	public static void main(String[] args) {

		OrderCalculator cal = new OrderCalculator();

		System.out.println();
		System.out.println("Price: " + cal.calcPrice(EventType.Wedding) + "\u20ac");
		System.out.println("Price: " + cal.calcPrice(EventType.Event) + "\u20ac");

	}

	// if it is not in vilnius

	public double calcFinalPrice(OrderCalculator ord) {
		return 0;
	}

}
