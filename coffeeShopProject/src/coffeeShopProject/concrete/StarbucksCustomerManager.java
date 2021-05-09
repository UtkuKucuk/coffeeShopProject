package coffeeShopProject.concrete;

import coffeeShopProject.abstracts.BaseCustomerManager;
import coffeeShopProject.abstracts.ICustomerCheckService;
import coffeeShopProject.entities.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager{
	ICustomerCheckService customerCheckService;
	public StarbucksCustomerManager()
	{
		
	}
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService)
	{
		this.customerCheckService = customerCheckService;
	}
	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		} 
		else {
			System.out.println("Not a valid person");
		}
		
	}

	
	
	
}
