package interdisciplinaryProject;
/**
 * Describes objects of type User 
 * @author Team 4
 *
 */
public class User {
	private String username;
	private String password;
	private String nationality;
	
	/**
	 * Constructor
	 * @param username
	 * @param password
	 * @param nationality
	 */
	public User(String username, String password, String nationality) {
		this.username = username;
		this.password = password;
		this.nationality = nationality;
	}
	
	
	
	/**
	 * @return username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username 
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return nationality
	 */
	public String getNationality() {
		return nationality;
	}
	/**
	 * @param nationality
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
}
