
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Player player = new Player();
		player.setId(1);
		player.setFirstName("Abdulkadir");
		player.setLastName("Demirel");
		player.setYearOfBirth(LocalDate.of(1998, 07, 17));
		player.setNationalityId("17201158454");

		PlayerManager playerManager = new PlayerManager(new MerniseServiceAdapter());
		playerManager.add(player);

		System.out.println("-----Oyuncu Listesi-----");
		List<Player> list = new ArrayList<Player>();
		list.add(player);
		for (Player player2 : list) {
			System.out.println(player2.getFirstName() + " " + player2.getLastName());

		}
		System.out.println("-------------------------");

		Game game = new Game();
		game.setId(1);
		game.setName("FÝFA 20");
		game.setCategory("Futbol");
		game.setPrice(200);

		Game game1 = new Game();
		game1.setId(2);
		game1.setName("GTA V");
		game1.setCategory("Aksiyon-Macera");
		game1.setPrice(100);

		Game game2 = new Game();
		game2.setId(3);
		game2.setName("Metin2");
		game2.setCategory("Rol Yapma");
		game2.setPrice(1000);

		System.out.println("-----Oyun Listesi-----");
		List<Game> games = new ArrayList<Game>();
		games.add(game);
		games.add(game1);
		games.add(game2);

		for (Game gamer : games) {
			System.out.println(gamer.getName());
		}
		System.out.println("------------------------");

		Campaign campaign = new Campaign();
		campaign.setId(1);
		campaign.setName("Yaza merhaba kampanyasý");
		campaign.setCampaignRate(50);

		Campaign campaign1 = new Campaign();
		campaign1.setId(2);
		campaign1.setName("Kýþýn son fýrsatlarý kampanyasý");
		campaign1.setCampaignRate(40);

		System.out.println("-----Kampanya Listesi-----");
		List<Campaign> campaigns = new ArrayList<Campaign>();
		campaigns.add(campaign);
		campaigns.add(campaign1);

		for (Campaign campaign2 : campaigns) {
			System.out.println(campaign2.getName());
		}
		System.out.println("------------------------");
		GameManager gameManager = new GameManager();

		gameManager.sales(game2, player, campaign1);

	}
}
