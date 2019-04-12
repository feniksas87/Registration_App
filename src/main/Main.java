package main;

import java.util.ArrayList;
import java.util.List;

import eu.kinstaitis.registration.pojo.Customer;

public class Main {

	public static void main(String[] args) {

		/*
		 * private String name; private String email; private String phoneNumber;
		 */

		List<Customer> custumer = new ArrayList<Customer>();
		custumer.add(new Customer("Vilius", "jonikas@email.com", "86666666666"));
		custumer.add(new Customer("Kamile", "kamiliukas@gmail.com", "8621000000"));
		custumer.add(new Customer("Vitali", "vitali@one.lt", "866612345"));
		custumer.add(new Customer("Rita", "ritulkins@gmail.com", "866698765"));
		custumer.add(new Customer("Tulpe", "tulpe@lrp.lt", "860000001"));
		custumer.add(new Customer("Juozas Kole", "juozas.kole@gmail.com", "86666666666"));
		custumer.add(new Customer("Biryte Cer", "cer@lnk.lt", "864423234"));
		custumer.add(new Customer("Dominykas Koliusas", "dominykas@email.com", "86666666666"));
		custumer.add(new Customer("Dainotas", "dainotas@email.com", "86666666666"));
		custumer.add(new Customer("Raimonda", "drakoniukas007@one.lt", "86666666666"));

	}

}
