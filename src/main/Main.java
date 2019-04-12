package main;

import java.util.List;

import eu.kinstaitis.registration.order.PhotoEvents;
import eu.kinstaitis.registration.pojo.Customer;
import eu.kinstaitis.registration.pojo.Order;

public class Main {

	public static void main(String[] args) {

		PhotoEvents events = new PhotoEvents();
		events.createOrder(new Order(new Customer("Vilius 1", "Vilnius@email.com", "vil"), "vil", "pas mane namuose "));
		events.createOrder(
				new Order(new Customer("Vilius 2", "viliux@vilnius.com", "vil"), "vil", "pas mane namuose vilniuje"));

		List<Order> searchResult = events.seartch("vil");

		for (Order order : searchResult) {
			System.out.println(order);
		}

		System.out.println("DONE");
	}

}
