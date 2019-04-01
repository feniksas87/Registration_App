package eu.kinstaitis.registration.custumer;

public class Person {

    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
    private String city;
    private String country;

    public Person(String name, String surname, String email, String phoneNumber, String city, String country) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.country = country;
    }
    public boolean isNotNull(Object persona) {
        if (this == persona) {
            return true;
        }
        if (persona == null || getClass() != persona.getClass()) {
            return false;
        }
        Person person = (Person) persona;
        if (name != null ? !name.equals(person.name) : person.name != null) {
            return false;
        }
        if (surname != null ? !surname.equals(person.surname) : person.surname != null) {
            return false;
        }
        if (email != null ? !city.equals(person.email) : person.email != null) {
            return false;
        }
        if (phoneNumber != null ? !phoneNumber.equals(person.phoneNumber) : person.phoneNumber != null) {
            return false;
        }
        if (city != null ? !city.equals(person.city) : person.city != null) {
            return false;
        }
        if (country != null ? !city.equals(person.country) : person.country != null) {
            return false;
        }
        return true;
    }

}
