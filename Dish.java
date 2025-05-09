package interdisciplinaryProject;

/**
 * Describes objects of type dish
 * @author team 4
 *
 */
public class Dish extends Gastronomy {
	private String dishType;
	
	/**
	 * Constructor
	 * @param name
	 * @param description
	 * @param dishType
	 */
	public Dish(String name, String description, String dishType) {
		super(name, description);
		this.dishType = dishType;
	}
	
	/**
	 * Accessor method to  get dish type
	 * @return dishType
	 */
	public String getType() {
		return dishType;
	}
	
	/**
	 * @param dishType
	 * Mutator method to get dish type
	 */
	public void setType(String dishType) {
		this.dishType = dishType;
	}
	
	/**
	 * @return s returns string with dish type atributes
	 */
	public String toString() { 
		String s = super.toString();
		return s + "\nDishType: " + dishType + "\n";
	}

}
