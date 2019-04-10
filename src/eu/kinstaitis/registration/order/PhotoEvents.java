package eu.kinstaitis.registration.order;

import java.util.ArrayList;
import java.util.List;

import eu.kinstaitis.registration.pojo.Order;

public class PhotoEvents {

	private List<Order> orders = new ArrayList<Order>();

	public Order order(Order order) {
		if (isOrderValid(order)) {

			orders.add(fillAttributes(order));
		}

		return order;
	}

	public boolean cancelOrder(Long orderId) {
		for (Order order : orders) {

			if (order.getOrderId().equals(orderId)) {
				if (!order.isCaceled()) {
					order.setCaceled(true);
					return true;
				}
				break;
			}
		}
		return false;
	}

	public List<Order> seartch(String txt) {
		List<Order> seartchResult = new ArrayList<Order>();

		for (Order order : orders) {
//TODO
		}
		return seartchResult;
	}

	private Order fillAttributes(Order order) {
//TODO
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

}
