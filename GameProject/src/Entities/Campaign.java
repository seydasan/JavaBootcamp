package Entities;
import Abstract.Entity;

public class Campaign implements Entity
{
	private int id;
	private String campaignName;
	private String content;
	private double discount;
	
	public Campaign() {}
	
	public Campaign(int id, String campaignName, String content, double discount) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.content = content;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
}
