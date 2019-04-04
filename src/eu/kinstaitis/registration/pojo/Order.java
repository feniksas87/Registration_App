package eu.kinstaitis.registration.pojo;

import eu.kinstaitis.registration.event.EventType;


public class Order {

    private Long orderId;
    private Customer customer;
    private String data;
    private EventType event;
    private double price;
    private String place;
    
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public EventType getEvents() {
		return event;
	}
	public void setEvents(EventType events) {
		this.event = events;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
}
