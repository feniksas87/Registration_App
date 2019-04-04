package pojo;

public class Customer {

    private String name;
    private String email;
    private String phoneNumber;


    public Customer(String name, String surname, String email, String phoneNumber, String textMasage, String city, String country) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
      
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
