package coffeeShopProject.abstracts;

import coffeeShopProject.entities.Customer;

public interface ICustomerCheckService {
	
	public boolean checkIfRealPerson(Customer customer);

}
