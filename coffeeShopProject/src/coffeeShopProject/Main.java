package coffeeShopProject;

import coffeeShopProject.abstracts.BaseCustomerManager;
import coffeeShopProject.adapter.MernisServiceAdaptar;
import coffeeShopProject.concrete.StarbucksCustomerManager;
import coffeeShopProject.entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdaptar());
		customerManager.save(new Customer("Muhammet Utku", "Küçük", 1999, "19730393252"));
		

        
        
        
        
	}

}
