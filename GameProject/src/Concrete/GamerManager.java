package Concrete;
import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService
{
	private GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) 
	{
		super();
		this.gamerCheckService = gamerCheckService;
	}
	
	@Override
	public void Add(Gamer gamer) 
	{
		if (gamerCheckService.CheckPerson(gamer)) 
		{
			System.out.println("Kullan�c� Do�ruland�: "+ gamer.getFirstName() +" "+ gamer.getLastName()+" Oyuncu Kayd� Ba�ar�l�");
		}
		else 
		{
			System.out.println("Tan�ml� olmayan kullan�c�! "+ gamer.getFirstName() +" "+ gamer.getLastName() +" Kay�t Ba�ar�s�z!");
		}
	}

	@Override
	public void Update(Gamer gamer) 
	{
		System.out.println("Oyuncu Eklendi: "+ gamer.getFirstName() + gamer.getLastName());
	}

	@Override
	public void Delete(Gamer gamer) 
	{
		System.out.println("Oyuncu Eklendi: "+ gamer.getFirstName() + gamer.getLastName());
	}
}
