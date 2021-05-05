package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService 
{
	KPSPublicSoapProxy client = new KPSPublicSoapProxy();
	
	@Override
	public boolean CheckPerson(Customer customer) 
	{
		boolean result=false;
		try 
		{
			result= client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName(),customer.getLastName(),customer.getDateOfBirth());
		} 
		catch (NumberFormatException e) {
			e.printStackTrace();
		} 
		catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}

}
