
public class GameManager implements GameService {

	@Override
	public void sales(Game game, Player player, Campaign campaign) {
		System.out.println(player.getFirstName()+" "+player.getLastName()+" adl� oyuncu "+ game.getName()+" adl� oyunu "+campaign.getName()+" adl� kampanyadan yararlanarak "+game.getPrice()+" TL yerine sadece  "+(game.getPrice()-(game.getPrice()*campaign.getCampaignRate()/100))+" TL'ye sat�n alm��t�r.");

		System.out.println(campaign.getName()+" adl� kampanya se�ilerek %"+campaign.getCampaignRate()+" indirim uygulanm��t�r.");
		
	}

}
