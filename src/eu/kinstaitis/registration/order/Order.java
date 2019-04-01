package eu.kinstaitis.registration.order;

import eu.kinstaitis.registration.event.Events;
import eu.kinstaitis.registration.citys.City;
import eu.kinstaitis.registration.custumer.Customer;
import eu.kinstaitis.registration.custumer.Person;

public class Order {

    private Long orderId;
    private String customer; //class
    private String data;
    private Events events;
    private String message;
    private City city;
    private String orderCalculator; //class

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Events getEvents() {
        return events;
    }

    public void setEvents(Events events) {
        this.events = events;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getOrderCalculator() {
        return orderCalculator;
    }

    public void setOrderCalculator(String orderCalculator) {
        this.orderCalculator = orderCalculator;
    }
}
