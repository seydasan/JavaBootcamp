package Adapters;
import java.rmi.RemoteException;

import Abstract.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceManager implements GamerCheckService 
{
	KPSPublicSoapProxy client = new KPSPublicSoapProxy();
	
	@Override
	public boolean CheckPerson(Gamer gamer) 
	{
		boolean result=false;
		try 
		{
			result= client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()),
															gamer.getFirstName(),gamer.getLastName(),
															gamer.getDateOfBirth());
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
