import java.util.Iterator;

public class PlayerManager implements PlayerService {
	
	PlayerCheckService playerCheckService;
	
	public  PlayerManager(PlayerCheckService playerCheckService) {
			this.playerCheckService=playerCheckService;
	}

	@Override
	public void add(Player player) {
		if(this.playerCheckService.CheckIfRealPerson(player))
		{
			System.out.println(player.getFirstName()+" "+player.getLastName()+" adlý oyuncu sisteme baþarýyla eklendi.");
		}
		else {
			
			System.out.println("Not a valid person");
		}

		
	}

	@Override
	public void delete(Player player) {
		System.out.println(player.getFirstName()+" "+player.getLastName()+" adlý oyuncu sistemden baþarýyla silindi.");
		
	}

	@Override
	public void update(Player player) {
		System.out.println(player.getFirstName()+" "+player.getLastName()+" adlý oyuncunun bilgileri baþarýyla güncellendi.");
		
	}


		
	

}
