package eu.kinstaitis.registration.custumer;

public class Customer {

    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private String textMasage;
    private String city;
    private String country;

    public Customer(String name, String surname, String email, String phoneNumber, String textMasage, String city, String country) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.textMasage = textMasage;
        this.city = city;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    public String getTextMasage() {
        return textMasage;
    }

    public void setTextMasage(String textMasage) {
        this.textMasage = textMasage;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
