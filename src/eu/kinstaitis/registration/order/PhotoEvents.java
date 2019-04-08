package eu.kinstaitis.registration.order;

import java.util.ArrayList;
import java.util.List;

import eu.kinstaitis.registration.pojo.Customer;
import eu.kinstaitis.registration.pojo.EventType;
import eu.kinstaitis.registration.pojo.Order;

public class PhotoEvents {

	private List<Order> orders = new ArrayList<Order>();

	public Order book(Order order) {
		if (isOrderValid(order)) {

			orders.add(fillAttributes(order));
		}

		return order;
	}

	private Order fillAttributes(Order order) {

		return null;
	}

	private boolean isOrderValid(Order order) {

		if (order.getCustomer() == null) {
			return false;
		}
		if (order.getData() == null) {
			return false;
		}
		if (order.getPlace() == null) {
			return false;
		}
		return true;
	}

	/*
	 * event is not canceled?
	 */

	public boolean order() {
		return true;
	}

	public Order bookingList(Customer customer, String data, EventType events, String place) {

		return null;
	}

}
