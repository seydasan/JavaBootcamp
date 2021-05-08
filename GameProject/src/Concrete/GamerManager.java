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
			System.out.println("Kullanýcý Doðrulandý: "+ gamer.getFirstName() +" "+ gamer.getLastName()+" Oyuncu Kaydý Baþarýlý");
		}
		else 
		{
			System.out.println("Tanýmlý olmayan kullanýcý! "+ gamer.getFirstName() +" "+ gamer.getLastName() +" Kayýt Baþarýsýz!");
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
