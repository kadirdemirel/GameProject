import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MerniseServiceAdapter implements PlayerCheckService {

	@Override
	public boolean CheckIfRealPerson(Player player) {
		try {
			KPSPublicSoap client = new KPSPublicSoapProxy();
			
			boolean isValid = client.TCKimlikNoDogrula(Long.valueOf(player.getNationalityId()),
					player.getFirstName().toUpperCase(),player.getLastName().toUpperCase(),player.getYearOfBirth().getYear());
			return isValid;
		} catch (Exception e) {
			
			System.out.println("Giriþ bilgileri doðru deðil");
		}
		
		return false;
  	
	}

}
