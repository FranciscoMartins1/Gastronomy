package interdisciplinaryProject;

/**
 * Describes objects of type wine
 * @author team 4
 *
 */
public class Wine extends Gastronomy {
	private String wineType;
	
	/**
	 * Constructor
	 * @param name
	 * @param description
	 * @param wineType
	 */
	public Wine(String name, String description, String wineType) {
		super(name, description);
		this.wineType = wineType;
	}
	
	/**
	 * Accessor method to get wine type
	 * @return
	 */
	public String getType() {
		return wineType;
	}
	
	/**
	 * Mutator method to set wine type
	 * @param wineType
	 */
	public void setType(String wineType) {
		this.wineType = wineType;
	}
	
	/**
	 * @return s returns string with wine type atributes
	 */
	@Override
	public String toString() { 
		String s = super.toString();
		return s + "\nwineType: " + wineType + "\n";
	}
}
