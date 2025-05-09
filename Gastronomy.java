/**
 * 
 */
package interdisciplinaryProject;

/**
 * Describes objects of type gastronomy 
 * Super class of Wine and Dish 
 * @author team 4
 *
 */
public abstract class Gastronomy {
	private String name;
	private String description;

	/**
	 * Constructor
	 * @param name
	 * @param description
	 */
	public Gastronomy(String name, String description) {
		this.name = name;
		this.description = description;
	}

	/**
	 * Accessor method to get name
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Mutator method to set name
	 * @param name 
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Accessor method to  get description
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Mutator method to set description
	 * @param description 
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * @return returns string with wine type atributes
	 */
	@Override
	public String toString() {
		return "\nName: " + name + "\nDescription: " + description;
	}
	
	/**
	 * Abstract mutator method to set type of wine or dish (dynamic method search)
	 * @param type
	 */
	public abstract void setType(String type);

}