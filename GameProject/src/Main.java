import Abstract.GameService;
import Adapters.MernisServiceManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) 
	{
		GamerManager gamerManager=new GamerManager(new MernisServiceManager());
		gamerManager.Add(new Gamer(1, "Þeyda", "Asan",1998,"40757119396","test@gmail.com"));
		
		GameService gameService =new GameManager();
		gameService.Add(new Game(2,"Call of Duty",1.0));
	
		Campaign campaign=new Campaign(1,"Anneler Günü","Anneler Gününe Özel Sepette %30 Ýndirim",1.0);
		Game game=new Game(1,"Pubg",1.0);
		Gamer gamer=new Gamer(1,"Seyda","Asan",1998,"40757119396","test@gmail.com");
		
		SaleManager saleManager=new SaleManager();
		saleManager.CampaignSale(game, gamer, campaign);
		saleManager.Sale(game, gamer);
	}
}
