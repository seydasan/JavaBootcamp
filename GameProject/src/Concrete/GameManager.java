package Concrete;
import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService
{
	@Override
	public void Add(Game game) 
	{
		System.out.println("Oyun Eklendi: " + game.getGameName());
	}

	@Override
	public void Update(Game game) 
	{
		System.out.println("Oyun Güncellendi: " + game.getGameName());
	}

	@Override
	public void Delete(Game game) 
	{
		System.out.println("Oyun Silindi: " + game.getGameName());
	}
	
}
