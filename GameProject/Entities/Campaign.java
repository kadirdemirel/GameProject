
public class Campaign implements Entity {
	private int id;
	private String name;
	private int campaignRate;
	
	public Campaign()
	{
		
	}
	public Campaign(int id,String name,int campaignRate)
	{
		this.id=id;
		this.name=name;
		this.campaignRate=campaignRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getCampaignRate() {
		return campaignRate;
	}
	public void setCampaignRate(int campaignRate) {
		this.campaignRate = campaignRate;
	}


}
