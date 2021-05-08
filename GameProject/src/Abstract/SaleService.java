package Abstract;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface SaleService 
{
	void Sale(Game game,Gamer gamer);
	void CampaignSale(Game game,Gamer gamer,Campaign campaign);
}
