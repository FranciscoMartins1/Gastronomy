package interdisciplinaryProject;
/**
 * Describes objects of type Comment 
 * @author vascosantos
 *
 */
public class Comment {
	String username;
	String text;
	/**
	 * Constructor
	 * @param username
	 * @param text
	 */
	public Comment(String username, String text) {
		this.username = username;
		this.text = text;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	
	/**
	 * @return text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @return s string with wine type atributes
	 */
	@Override
	public String toString() {
		return "\n" + username + ": " + text;
	}
	
	
}
