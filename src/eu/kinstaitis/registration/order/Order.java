package eu.kinstaitis.registration;

//import javax.validation.constraints.NotNull;

public class Order {

    private Long orderId;
    private String customer; //class
    private String data;
    private String event; //class
    private String message;
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

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getOrderCalculator() {
        return orderCalculator;
    }

    public void setOrderCalculator(String orderCalculator) {
        this.orderCalculator = orderCalculator;
    }

}
