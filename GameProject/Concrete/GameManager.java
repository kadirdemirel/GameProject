
public class GameManager implements GameService {

	@Override
	public void sales(Game game, Player player, Campaign campaign) {
		System.out.println(player.getFirstName()+" "+player.getLastName()+" adlý oyuncu "+ game.getName()+" adlý oyunu "+campaign.getName()+" adlý kampanyadan yararlanarak "+game.getPrice()+" TL yerine sadece  "+(game.getPrice()-(game.getPrice()*campaign.getCampaignRate()/100))+" TL'ye satýn almýþtýr.");

		System.out.println(campaign.getName()+" adlý kampanya seçilerek %"+campaign.getCampaignRate()+" indirim uygulanmýþtýr.");
		
	}

}
