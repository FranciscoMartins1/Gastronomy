package interdisciplinaryProject;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Class that contains methods to manage all functionalities
 * @author team 4
 *
 */
public class Bulgaria {
	private ArrayList <Festivity> bulgaria;
	private ArrayList <User> users;
	int[] nationalityCount; // to keep track of number of user for each nationality


	/**
	 * Constructor
	 * Creates arraylist of festivities
	 * Creates arraylist of users
	 * Creates array of nationalities count
	 */
	public Bulgaria() {
		bulgaria = new ArrayList<Festivity>();
		users = new ArrayList<User>();
		nationalityCount = new int[240];
		for(int i = 0; i < nationalityCount.length;i++ ) {
			nationalityCount[i] = 0;
		}
	}

	/**
	 * Adds object of type festivity to arraylist bulgaria.
	 * @param newFestivity object of type festivity to be added
	 */
	public void registerFestivity (Festivity newFestivity){
		bulgaria.add(newFestivity);
		JOptionPane.showMessageDialog(null, "New festivity registered!");
	}
	
	
	/**
	 * Search festivity by name in arraylist bulgaria and returns festivity position.
	 * @param festivityName festivity name to search in arraylist
	 * @return returns k if it finds festivity name, returns -1 if not.
	 */
	public int searchFestivityByName (String festivityName) {
        int k = 0;
        while(k < bulgaria.size() && !bulgaria.get(k).getName().equalsIgnoreCase(festivityName)) {
           k++; 
        }
        
        if(k >= bulgaria.size()){
            return -1;
        }else{
            return k;
        }
        
    }
	
	/**
	 * Returns an array of festivities in a selected region.
	 * @param festivityRegion region by which festivities will be filtered
	 * @return festivitiesByRegion array with festivities of region
	 */
	public String[] filterByRegion (String festivityRegion) {

        int count = 0;
        String[] festivitiesByRegion = new String[30];
		for (Festivity f : bulgaria ) {
           if (f.getRegion().equalsIgnoreCase(festivityRegion)) {
        	   festivitiesByRegion[count] = f.getName();
        	   count += 1;
           }
        }
        return festivitiesByRegion;
     }
	
	/**
	 * Adds new gastronomy to festivity.
	 * @param festivityName name of festivity to search position in arraylist bulgaria.
	 * @param newGastronomy gastronomy to be added.
	 */
	public void registerGastronomy(String festivityName, Gastronomy newGastronomy){
        int pos = searchFestivityByName(festivityName);
        if (pos == -1){
        	JOptionPane.showMessageDialog(null, "Festivity not found!");
        }else{
           bulgaria.get(pos).registerGastronomy(newGastronomy);
        }
        
    }
	
	/**
	 * Displays festivity information and extra information(history, Landmarks, Gastronomy, likes and comments)
	 * @param festivityName name of festivity to search position in arraylist bulgaria.
	 */
	public void displayFestivityDetails(String festivityName, int userPos){

		int pos = searchFestivityByName(festivityName);
		int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Festivity details:" + "\nName: " + bulgaria.get(pos).getName() + "\nRegion: " + bulgaria.get(pos).getRegion() + "\nDate: " + bulgaria.get(pos).getDate() + "\nLikes: " + bulgaria.get(pos).getLikeCount() + "\n\nKnow more about: \n1) History \n2) Landmarks \n3) Gastronomy \n\nInteractions:\n4) Comment\n5) View comments\n6) Like\n7) Return to menu"));
		while(op != 7) {
			switch(op) {
				case 1:
					JOptionPane.showMessageDialog(null, bulgaria.get(pos).getHistory());
					break;
				case 2:
					JOptionPane.showMessageDialog(null, bulgaria.get(pos).getLandMarks());
					break;
				case 3:
					JOptionPane.showMessageDialog(null, bulgaria.get(pos).printGastronomy());
					break;
				case 4:
					String comment = JOptionPane.showInputDialog("Write your comment!");
					String username = users.get(userPos).getUsername();
					bulgaria.get(pos).createComment(username, comment);
					break;
				case 5:
					JOptionPane.showMessageDialog(null, bulgaria.get(pos).displayComments());
					break;
				case 6:
					bulgaria.get(pos).incrementLikeCount();
					break;
				
			}
			
			op = Integer.parseInt(JOptionPane.showInputDialog(null, "Festivity details:" + "\nName: " + bulgaria.get(pos).getName() + "\nRegion: " + bulgaria.get(pos).getRegion() + "\nDate: " + bulgaria.get(pos).getDate() + "\nLikes: " + bulgaria.get(pos).getLikeCount() + "\n\nKnow more about: \n1) History \n2) Landmarks \n3) Gastronomy \n\nInteractions:\n4) Comment\n5) View comments\n6) Like\n7) Return to menu"));	
		}
		
	}
	
	public void displayFestivityDetails(String festivityName){

		int pos = searchFestivityByName(festivityName);
		int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Festivity details:" + "\nName: " + bulgaria.get(pos).getName() + "\nRegion: " + bulgaria.get(pos).getRegion() + "\nDate: " + bulgaria.get(pos).getDate() + "\n\nKnow more about: \n1) History \n2) Landmarks \n3) Gastronomy \n\nInteractions:\n4) View comments\n5) Return to menu"));
		while(op != 5) {
			switch(op) {
				case 1:
					JOptionPane.showMessageDialog(null, bulgaria.get(pos).getHistory());
					break;
				case 2:
					JOptionPane.showMessageDialog(null, bulgaria.get(pos).getLandMarks());
					break;
				case 3:
					JOptionPane.showMessageDialog(null, bulgaria.get(pos).printGastronomy());
					break;
				case 4:
				
			}
			
			op = Integer.parseInt(JOptionPane.showInputDialog(null, "Festivity details:" + "\nName: " + bulgaria.get(pos).getName() + "\nRegion: " + bulgaria.get(pos).getRegion() + "\nDate: " + bulgaria.get(pos).getDate() + "\n\nKnow more about: \n1) History \n2) Landmarks \n3) Gastronomy \n\nInteractions:\n4) Comment\n5) View comments\n6) Like\n7) Return to menu"));	
		}
		
	}


	/**
	 * Counts how many festivity exist.
	 * @return count number of festivities that exist
	 */
	public int countFestivites() {
		int count = 0;
		for (int i = 0;i < bulgaria.size();i++) {
			count++;
		}
		return count;
	}

	/**
	 * Returns array with the names of all festivities.
	 * @return festivitiesNames array with names of festivities.
	 */
	public String[] getFestivitiesNames () {

        int count = 0;
        String[] festivitiesNames = new String[30];
		for (Festivity f : bulgaria) {
			festivitiesNames[count] = f.getName();
        	   count += 1;
           }
        return festivitiesNames;
     }

	/**
	 * Updates festivity information(Region, History, LandMarks)
	 * @param festivityName name of festivity to search position in arraylist bulgaria
	 * @param info information the user wants to update
	 * @param newInfo new information
	 */
	public void updateFestivityInfo(String festivityName, String info, String newInfo) {
		int pos = searchFestivityByName(festivityName);
		if (pos == -1){
			JOptionPane.showMessageDialog(null, "Festivity not found!");
        }else{
        	if (info.equalsIgnoreCase("Region")) {
        		bulgaria.get(pos).setRegion(newInfo);
        		JOptionPane.showMessageDialog(null, "Region updated!");
        	} else if(info.equalsIgnoreCase("History")) {
        			bulgaria.get(pos).setHistory(newInfo);
        			JOptionPane.showMessageDialog(null, "History updated!");
        	}else {
        		bulgaria.get(pos).setLandMarks(newInfo);
        		JOptionPane.showMessageDialog(null, "Landmarks updated!");
        	}
           
        }
	}
	
	/**
	 * Updates festivity gastronomy.
	 * @param festivityName name of festivity to search position in arraylist bulgaria
	 * @param gastronomy gastronomy to be updated
	 * @param info information the user wants to update
	 */
	public void updateFestivityGastronomy(String festivityName, String gastronomy, String info) {
		int pos = searchFestivityByName(festivityName);
		if (pos == -1){
			JOptionPane.showMessageDialog(null, "Festivity not found!");
        }else{
        	bulgaria.get(pos).updateFestivityGastronomy(gastronomy, info);
        }
	}
	

	/**
	 * Returns array with gastronomies of a specified festivity.
	 * @param festivityName name of festivity to search position in arraylist bulgaria
	 * @return array with gastronomies of a specified festivity
	 */
	public String[] getFestivityGastronomies(String festivityName) {
		 int pos = searchFestivityByName(festivityName);
	     return bulgaria.get(pos).getFestivityGastronomies();
	}
	
	/**
	 * Adds new user to arraylist users
	 * @param newUser
	 */
	public void registerUser(User newUser) {
		users.add(newUser);
		JOptionPane.showMessageDialog(null, "User registred!");
	}
	
	/**
	 * search username in arraylist users
	 * @param username username to search
	 * @return k if it finds username, returns -1 if not.
	 */
	public int searchUsersByName (String username) {
        int k = 0;
        while(k < users.size() && !users.get(k).getUsername().equalsIgnoreCase(username)) {
           k++; 
        }
        
        if(k >= users.size()){
            return -1;
        }else{
            return k;
        }
        
    }
	
	/**
	 * search username in arraylist users
	 * @param password
	 * @return k if it finds username, returns -1 if not.
	 */
	public int searchUsersByPassword (String password) {
        int k = 0;
        while(k < users.size() && !users.get(k).getPassword().equalsIgnoreCase(password)) {
           k++; 
        }
        
        if(k >= users.size()){
            return -1;
        }else{
            return k;
        }
        
    }
	
	/**
	 * Returns position of authenticated user if he exist and returns -1 if not
	 * @param username
	 * @param password
	 * @return pos
	 */
	public int getUserPosition (String username, String password) {
		int pos;
		if (searchUsersByName(username) == searchUsersByPassword (password)) {
			pos = searchUsersByName(username);
		}else {
			pos = -1;
		}
		return pos;
	}
	/**
	 * Does authentication of users login
	 * @param username
	 * @param password
	 * @return authentication
	 */
	public boolean loginAuthentication (String username, String password) {
		boolean authentication = false;
		if (getUserPosition(username, password) != -1) {
			authentication = true;
		}else {
			JOptionPane.showMessageDialog(null, "User not found!");
		}
		
		return authentication;
	}
	/**
	 * Get username of active user
	 * @param pos
	 * @return username
	 */
	public String getUsername (int pos) {
		return users.get(pos).getUsername();
	}
	
	/**
	 * Increments count of nationality
	 * @param nationality
	 * @param countries
	 */
	public void registrerNationality (String nationality, String[] countries) {
		for (int i = 0;i < countries.length;i++) {
			if(countries[i].equalsIgnoreCase(nationality)) {
				nationalityCount[i] += 1;
			}
		}
	}
	/**
	 * Displays nationalities and their counts
	 * @param countries
	 * @return s 
	 */
	public String displayNationalities(String[] countries) {
		String s = "Nationalities:";
		for (int i = 0;i < nationalityCount.length;i++) {
			if(nationalityCount[i] > 0) {
				s = s + "\n" + countries[i] + ": " + nationalityCount[i];
			}
		}
		
		return s;
	}
	/**
	 * Validates users making registration
	 * @param username
	 * @return validation
	 */
	public boolean registrationValidation(String username) {
		boolean validation = false;
		int pos = searchUsersByName(username); 
		if (pos == -1) {
			validation = true;
		}
		return validation;
	}
	
}//end Bulgaria
