package coffeeShopProject.concrete;

import coffeeShopProject.abstracts.ICustomerCheckService;
import coffeeShopProject.entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
		// TODO Auto-generated method stub
		
	}

}
