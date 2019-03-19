package eu.kinstaitis.registration;

public class PersonKamile {
	
	private String name = "Kamile";
	private String secondName = "Marija"; // possible null
	private String secondSurname = "Kontrotaitė"; // possible null
	private String surname = "Kolienė";
	private String email = "koliene@yahoo.com";
	private String phoneNumber = "+37060000000";
	private String city = "Vilnius";
	private String country = "Lithuania";
	
	public PersonKamile(String name, String secondName, String secondSurname, String surname, String email,
			String phoneNumber, String city, String country) {
		super();
		this.name = name;
		this.secondName = secondName;
		this.secondSurname = secondSurname;
		this.surname = surname;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.city = city;
		this.country = country;
	}
		

}
