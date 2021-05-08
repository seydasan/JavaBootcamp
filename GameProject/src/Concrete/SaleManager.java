package Concrete;
import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService
{

	@Override
	public void Sale(Game game, Gamer gamer) 
	{
		System.out.println(gamer.getFirstName()+ " "+gamer.getLastName()+" oyuncusu "+game.getGameName()+" oyununu satýn aldý.");
	}

	@Override
	public void CampaignSale(Game game, Gamer gamer, Campaign campaign) 
	{
		System.out.println(gamer.getFirstName()+" "+ gamer.getLastName() +
							" Oyuncusu "+game.getGameName()+" oyununu "+
							campaign.getCampaignName()+" kampanyasýyla satýn aldý.");
	}
}
