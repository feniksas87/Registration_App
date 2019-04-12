package eu.kinstaitis.registration.order;

import java.util.ArrayList;
import java.util.List;

import eu.kinstaitis.registration.pojo.EventType;
import eu.kinstaitis.registration.pojo.Order;

public class PhotoEvents {

	private List<Order> orders = new ArrayList<Order>();

	public Order createOrder(Order order) {
		if (isOrderValid(order)) {

			orders.add(fillAttributesForNewOrder(order));
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

			if (textConText(order.getPlace(), txt)) {
				seartchResult.add(order);
			} else if (textConText(order.getData(), txt)) {
				seartchResult.add(order);
			} else if (textConText("" + order.getEvent(), txt)) {
				seartchResult.add(order);
			} else if (textConText("" + order.getOrderId(), txt)) {
				seartchResult.add(order);
			} else if (textConText("" + order.getPrice(), txt)) {
				seartchResult.add(order);
			} else if (textConText(order.getCustomer().getName(), txt)) {
				seartchResult.add(order);
			} else if (textConText(order.getCustomer().getEmail(), txt)) {
				seartchResult.add(order);
			} else if (textConText(order.getCustomer().getPhoneNumber(), txt)) {
				seartchResult.add(order);
			}

		}
		return seartchResult;
	}

	private boolean textConText(String text, String subtext) {

		if (text.isEmpty()) {
			return false;
		}
		if (subtext.isEmpty()) {
			return false;
		}
		return text.toLowerCase().contains(subtext.toLowerCase());

	}

	private Order fillAttributesForNewOrder(Order order) {

		order.setOrderId(System.currentTimeMillis());

		if (order.getEvent() == null) {
			order.setEvent(EventType.Other);
		}

		OrderCalculator orderCalculatator = new OrderCalculator();
		order.setPrice(orderCalculatator.calcPrice(order.getEvent()));

		return order;
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
}
