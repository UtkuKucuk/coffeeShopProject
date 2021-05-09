package coffeeShopProject.adapter;

import coffeeShopProject.abstracts.ICustomerCheckService;
import coffeeShopProject.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdaptar implements ICustomerCheckService{
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoap client=new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),customer.getDateOfBirth());
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
	}
}
