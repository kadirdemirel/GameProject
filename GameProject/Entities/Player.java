import java.time.LocalDate;

public class Player implements Entity {
	private int id;
	private String firstName;
	private String lastName;
	private LocalDate yearOfBirth;
	private String nationalityId;
	
	public Player()
	{
		
	}
	
	public Player(int id, String firstName,String lastName,LocalDate yearOfBirth,String nationalityId)
	{
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.yearOfBirth=yearOfBirth;
		this.nationalityId=nationalityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(LocalDate yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	

}
