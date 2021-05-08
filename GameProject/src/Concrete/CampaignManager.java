package Concrete;
import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService
{
	@Override
	public void Add(Campaign campaign) 
	{
		System.out.println("Kampanya Eklendi: " + campaign.getCampaignName());
	}

	@Override
	public void Update(Campaign campaign) 
	{
		System.out.println("Kampanya Güncellendi: " + campaign.getCampaignName());
	}

	@Override
	public void Delete(Campaign campaign) 
	{
		System.out.println("Kampanya Silindi: " + campaign.getCampaignName());
	}

}
