package interdisciplinaryProject;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Describes objects of type Festivity
 * @author team 4
 *
 */
public class Festivity {
	

	private String name;
	private String region;
	private String date;
	private String history;
	private String landMarks;
	private int likeCount;
	private ArrayList <Gastronomy> gastronomy;
	private ArrayList <Comment> comments;
	String[] dishTypes = {"Meat", "Fish", "Vegeterian", "Vegan"};
	String[] wineTypes = {"Red", "White", "Rosé", "Sparkling"};
	
	/**
	 * Constructor
	 * @param name
	 * @param region
	 * @param date
	 * @param history
	 * @param landMarks
	 */
	public Festivity(String name, String region, String date, String history, String landMarks) {
		this.name = name;
		this.region = region;
		this.date = date;
		this.history = history;
		this.landMarks = landMarks;
		gastronomy = new ArrayList<Gastronomy>();
		comments = new ArrayList<Comment>();
		this.likeCount = 0;
	}
	
	
	/**
	 * Accessor method to get name
	 * @return name
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
	 * Accessor method get region
	 * @return region
	 */
	public String getRegion() {
		return region;
	}
	
	/**
	 * Mutator method to set region
	 * @param region
	 */
	public void setRegion(String region) {
		this.region = region;
	}

	/**
	 * Accessor method to get date
	 * @return date
	 */
	public String getDate() {
		return date;
	}
	
	/**
	 * Mutator method to set date
	 * @param date
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * Accessor method to get history
	 * @return history
	 */
	public String getHistory() {
		return history;
	}

	/**
	 * Mutator method to set history
	 * @param history the history to set
	 */
	public void setHistory(String history) {
		this.history = history;
	}


	/**
	 * Accessor method to get landmarks
	 * @return landMarks
	 */
	public String getLandMarks() {
		return landMarks;
	}

	/**
	 * Mutator method to set landmarks
	 * @param landMarks 
	 */
	public void setLandMarks(String landMarks) {
		this.landMarks = landMarks;
	}
	/**
	 * @return the likeCount
	 */
	public int getLikeCount() {
		return likeCount;
	}


	/**
	 * Incrments like count of festivity
	 */
	public void incrementLikeCount() {
		this.likeCount ++;
		JOptionPane.showMessageDialog(null, "Like registred!");
	}
	/**
	 * Adds new gastronomy to arraylist gastronomy
	 * @param newGastronomy
	 */
	public void registerGastronomy(Gastronomy newGastronomy ){
		gastronomy.add(newGastronomy);
		JOptionPane.showMessageDialog(null, "New gastronomy registered!");
	}
	
	/**
	 * Prints gastronomy details
	 * @return s String with gastronomy details
	 */
	public String printGastronomy(){   
		String s = "\nGastronomy:\n";
	    for (Gastronomy g:gastronomy){ 
	    	 s = s + g + "\n";
	   
	    }
		return s; 
    } 
	
	/**
	 * @return festivitiesGastronomies array with all festivity gastronomies
	 */
	public String[] getFestivityGastronomies() {
		int count = 0;
        String[] festivitiesGastronomies = new String[30];
		for (Gastronomy g : gastronomy) {
			festivitiesGastronomies[count] = g.getName();
        	   count += 1;
           }
        return festivitiesGastronomies;
	}
	
	/**
	 * Returns position of gastronomy in arraylist gastronomies
	 * @param gastronomyName name of gastronomy to search
	 * @return k or -1 if gastronomy name not founded
	 */
	public int searchGastronomyByName (String gastronomyName) {
        int k = 0;
        while(k < gastronomy.size() && !gastronomy.get(k).getName().equalsIgnoreCase(gastronomyName)) {
           k++; 
        }
        
        if(k >= gastronomy.size()){
            return -1;
        }else{
            return k;
        }
        
    }

	/**
	 * Updates gastronomy information
	 * @param gastronomyName name of gastronomy to search
	 * @param info information the user wants to update
	 */
	public void updateFestivityGastronomy(String gastronomyName,String info) {
		int pos = searchGastronomyByName(gastronomyName);
		String newInfo;
        	if (info.equalsIgnoreCase("Type")) {
        		if (gastronomy.get(pos) instanceof Dish) {
        			newInfo = (String) JOptionPane.showInputDialog(null,"Type?","Choose type", JOptionPane.QUESTION_MESSAGE, null, dishTypes, dishTypes[3]);
        			gastronomy.get(pos).setType(newInfo);
        			JOptionPane.showMessageDialog(null, "Gastronomy type updated!");
        		}else {
        			newInfo = (String) JOptionPane.showInputDialog(null,"Type?","Choose type", JOptionPane.QUESTION_MESSAGE, null, wineTypes, wineTypes[3]);
        			gastronomy.get(pos).setType(newInfo);
        			JOptionPane.showMessageDialog(null, "Gastronomy type updated!");
        			
        		}
        		 	
        	} else if(info.equalsIgnoreCase("Name")) {
        			newInfo = JOptionPane.showInputDialog("New information?");
        			gastronomy.get(pos).setName(newInfo);
        			JOptionPane.showMessageDialog(null, "Gastronomy name updated!");
        			}else {
        				newInfo = JOptionPane.showInputDialog("New information?");
        				gastronomy.get(pos).setDescription(newInfo);
        				JOptionPane.showMessageDialog(null, "Gastronomy description updated!");
        			}
     		}
	

	/**
	 * Adds new comment to arraylist comments
	 * @param username
	 * @param comment
	 */
	public void createComment(String username, String comment) {
		Comment newComment = new Comment(username, comment);
		comments.add(newComment);
		JOptionPane.showMessageDialog(null, "New comment registered!");
	}
	
	/**
	 * Displays comment
	 */
	public String displayComments() {
		String s = "\nComments:\n";
		for (Comment c : comments) {
		    	 s = s + c + "\n";  	 
        }
		return s; 
	}	
}