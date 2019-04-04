package eu.kinstaitis.registration.order;

import java.util.HashMap;
import java.util.Map;

import eu.kinstaitis.registration.event.EventType;

public class OrderCalculator {

	public static void main(String[] args) {

		Map<String, String> type = new HashMap<>();
		type.put("Wedding", "350");
		type.put("Christening", "200");
	}

	public double calcPrice(EventType type) {

		switch (type) {
		case Wedding:
			System.out.println("350");
			break;
		case Christening:
			System.out.println("200");
			break;
		case GivingAname:
			System.out.println("200");
			break;
		case Party:
			System.out.println("200");
			break;
		case Conference:
			System.out.println("100");
			break;
		case Photoshoot:
			System.out.println("90");
			break;
		case ModelPortfolio:
			System.out.println("90");
			break;
		case Event:
			System.out.println("120");
			break;
		case SportEvent:
			System.out.println("180");
			break;
		case Animals:
			System.out.println("100");
			break;
		case Commercial:
			System.out.println("250");
			break;
		case Jewelry:
			System.out.println("80");
			break;
		case Concert:
			System.out.println("200");
			break;
		case Interior:
			System.out.println("300");
			break;
		case Other:
			System.out.println("Call");
			break;
		default:
			break;
		}
		return 0;

	}

}
