package interdisciplinaryProject;
import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.Locale;

/**
 * @author team 4
 * @version 03/05
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bulgaria bulgarianFestivities = new Bulgaria();
		String adminPassword = "1234";
		String[] regions = {"Blagoevgrad", "Burgas", "Dobrich", "Gabrovo", "Haskovo", "Kardzhali", "Kyustendil", "Lovech", "Montana", "Pazardzhik", "Pernik", "Pleven", "Plovdiv", "Razgrad", "Ruse", "Shumen", "Silistra", "Sliven", "Smolyan", "Sofia (capital city)", "Sofia (Province)", "Stara Zagora", "Targovishte", "Varna", "Veliko Tarnovo", "Vidin", "Vratsa", "Yambol"};
		String[] gastronomyTypes = {"Dish", "Wine"};
		String[] dishTypes = {"Meat", "Fish", "Vegeterian", "Vegan"};
		String[] wineTypes = {"Red", "White", "Rosé", "Sparkling"};
		String[] festivityInfo = {"Region", "History", "Landmarks"};
		String[] gastronomyInfo = {"Name", "Description", "Type"};
		String[] countries = {"Afghanistan", "Albania", "Algeria", "American Samoa", "Andorra", "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia", "Bosnia and Herzegowina", "Botswana", "Bouvet Island", "Brazil", "British Indian Ocean Territory", "Brunei Darussalam", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Central African Republic", "Chad", "Chile", "China", "Christmas Island", "Cocos (Keeling) Islands", "Colombia", "Comoros", "Congo", "Congo, the Democratic Republic of the", "Cook Islands", "Costa Rica", "Cote d'Ivoire", "Croatia (Hrvatska)", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Falkland Islands (Malvinas)", "Faroe Islands", "Fiji", "Finland", "France", "France Metropolitan", "French Guiana", "French Polynesia", "French Southern Territories", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Greece", "Greenland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Heard and Mc Donald Islands", "Holy See (Vatican City State)", "Honduras", "Hong Kong", "Hungary", "Iceland", "India", "Indonesia", "Iran (Islamic Republic of)", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea, Democratic People's Republic of", "Korea, Republic of", "Kuwait", "Kyrgyzstan", "Lao, People's Democratic Republic", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libyan Arab Jamahiriya", "Liechtenstein", "Lithuania", "Luxembourg", "Macau", "Macedonia, The Former Yugoslav Republic of", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Martinique", "Mauritania", "Mauritius", "Mayotte", "Mexico", "Micronesia, Federated States of", "Moldova, Republic of", "Monaco", "Mongolia", "Montserrat", "Morocco", "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", "Netherlands Antilles", "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "Norfolk Island", "Northern Mariana Islands", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Pitcairn", "Poland", "Portugal", "Puerto Rico", "Qatar", "Reunion", "Romania", "Russian Federation", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Seychelles", "Sierra Leone", "Singapore", "Slovakia (Slovak Republic)", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Georgia and the South Sandwich Islands", "Spain", "Sri Lanka", "St. Helena", "St. Pierre and Miquelon", "Sudan", "Suriname", "Svalbard and Jan Mayen Islands", "Swaziland", "Sweden", "Switzerland", "Syrian Arab Republic", "Taiwan, Province of China", "Tajikistan", "Tanzania, United Republic of", "Thailand", "Togo", "Tokelau", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Turks and Caicos Islands", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "United States Minor Outlying Islands", "Uruguay", "Uzbekistan", "Vanuatu", "Venezuela", "Vietnam", "Virgin Islands (British)", "Virgin Islands (U.S.)", "Wallis and Futuna Islands", "Western Sahara", "Yemen", "Yugoslavia", "Zambia", "Zimbabwe", "Palestine"};
		int userPos = -1;
		
		/**
		 * Examples for the presentation
		
		//user examples
		User user = new User("vascosantos", "1q2w3e", "Portugal");
		bulgarianFestivities.registerUser(user);
		bulgarianFestivities.registrerNationality("Portugal", countries);
		
		user = new User("goncalo", "4e3w2q", "Bulgaria");
		bulgarianFestivities.registerUser(user);
		bulgarianFestivities.registrerNationality("Afghanistan", countries);
		
		//festivity examples
		Festivity newFestivityExample = new Festivity("Survakar Games Festival", "Blagoevgrad", "03-01", "Over 1200 mummers annually chase the \nevil forces in Blagoevgrad", "Blessed Virgin Church");
	    bulgarianFestivities.registerFestivity(newFestivityExample);
	    newFestivityExample = new Festivity("Spice Music Festival", "Burgas", "5-7 August", "Music festival in Burgas", "The Sea Garden");
	    bulgarianFestivities.registerFestivity(newFestivityExample);
	    newFestivityExample = new Festivity("Burgas International Film Festival", "Burgas", "9 June", "The main scope of the Festival is to present \nthe current trends in the Bulgarian and \ninternational cinema practice and to provoke intercultural dialogue.", "Ethnographic Museum Burgas");
	    bulgarianFestivities.registerFestivity(newFestivityExample);
	    */
	    
	    
	    
	    
		
		int op = Integer.parseInt(JOptionPane.showInputDialog("1. Enter as admin\n2. Enter as tourist\n3. Exit"));
		while(op != 3) {
		if(op == 1) {
			String password = JOptionPane.showInputDialog("Admin password:");
			
			while(!password.equalsIgnoreCase(adminPassword)) {
				JOptionPane.showMessageDialog(null, "Wrong Password!");
				password = JOptionPane.showInputDialog("Admin password:");
			}
			//Admin functinonalities
			op = menuAdmin();
			
			while(op != 7) {
				switch(op) {
				  case 1: //Add festivity
					Festivity newFestivity;
					String name = JOptionPane.showInputDialog("Name?");
					String region = (String) JOptionPane.showInputDialog(null,"Region?","Choose region", JOptionPane.QUESTION_MESSAGE, null, regions, regions[27]);
					//String region = JOptionPane.showInputDialog("Region?\n1)Blagoevgrad\n2)Burgas\n 3)	Dobrich 4)	Gabrovo 5)	Haskovo 6)	Kardzhali 7)	Kyustendil 8)	Lovech 9)	Montana 10)	Pazardzhik 11)	Pernik 12)	Pleven 13)	Plovdiv 14)	Razgrad 15)	Ruse 16)	Shumen 17)	Silistra 18)	Sliven 19)	Smolyan 20)	Sofia (capital city) 21)	Sofia Province 22)	Stara Zagora 23)	Targovishte 24)	Varna 25)	Veliko Tarnovo 26)	Vidin 27)	Vratsa 28)	Yambol ");
					String date = JOptionPane.showInputDialog("Date? format: dd-mm");
					String history = JOptionPane.showInputDialog("History?");
					String landmarks = JOptionPane.showInputDialog("Landmarks?"); 
					newFestivity = new Festivity(name, region, date, history, landmarks);
				    bulgarianFestivities.registerFestivity(newFestivity);
				   
				    break;
				  case 2: //Add gastronomy
					  if (bulgarianFestivities.countFestivites() == 0) {
							JOptionPane.showMessageDialog(null, "No festivities have been added yet.");
						}else {
							  Gastronomy newGastronomy;
							  String[] festivitiesNames = bulgarianFestivities.getFestivitiesNames();
							  String festivityName = (String) JOptionPane.showInputDialog(null,"Festivity?","Choose festivity", JOptionPane.QUESTION_MESSAGE, null, festivitiesNames, festivitiesNames[festivitiesNames.length - 1]);
							  String gastronomyType = (String) JOptionPane.showInputDialog(null,"Gastronomy type?","Choose gastronomy type", JOptionPane.QUESTION_MESSAGE, null, gastronomyTypes, gastronomyTypes[1]);
							  
							  if (gastronomyType.equalsIgnoreCase("Dish")) {
								  String dishName = JOptionPane.showInputDialog("Dish name?");
								  String dishDescription = JOptionPane.showInputDialog("Dish description?");
								  String dishType = (String) JOptionPane.showInputDialog(null,"Dish type?","Choose dish type", JOptionPane.QUESTION_MESSAGE, null, dishTypes, dishTypes[3]);
								  newGastronomy = new Dish(dishName, dishDescription, dishType);
							  }else {
								  String wineName = JOptionPane.showInputDialog("Wine name?");
								  String wineDescription = JOptionPane.showInputDialog("Wine description?");
								  String wineType = (String) JOptionPane.showInputDialog(null,"Wine type?","Choose wine type", JOptionPane.QUESTION_MESSAGE, null, wineTypes, wineTypes[3]);
								  newGastronomy = new Wine(wineName, wineDescription, wineType);
							  }
							  bulgarianFestivities.registerGastronomy(festivityName, newGastronomy);
						}
				    break;
				  case 3: //Change festivity
					  String newInfo;
					  if (bulgarianFestivities.countFestivites() == 0) {
							JOptionPane.showMessageDialog(null, "No festivities have been added yet.");
						}else {
							  String[] festivitiesNames = bulgarianFestivities.getFestivitiesNames();
							  name = (String) JOptionPane.showInputDialog(null,"Festivity?","Choose festivity", JOptionPane.QUESTION_MESSAGE, null, festivitiesNames, festivitiesNames[festivitiesNames.length - 1]);
							  String info = (String) JOptionPane.showInputDialog(null,"Which information do you want to change?","Choose information", JOptionPane.QUESTION_MESSAGE, null, festivityInfo, festivityInfo[festivityInfo.length - 1]);
							  if (info.equalsIgnoreCase("Region")) {
								  newInfo = (String) JOptionPane.showInputDialog(null,"Region?","Choose region", JOptionPane.QUESTION_MESSAGE, null, regions, regions[27]);
							  }else {
								   newInfo = JOptionPane.showInputDialog("New information?");
							  }
							  
							  bulgarianFestivities.updateFestivityInfo(name, info, newInfo);
					  }
					  
					  
					  
					
					break;
				  case 4: // Change gastronomy
					  if (bulgarianFestivities.countFestivites() == 0) {
							JOptionPane.showMessageDialog(null, "No festivities have been added yet.");
						}else {
						  String[] festivitiesNames = bulgarianFestivities.getFestivitiesNames();
						  name = (String) JOptionPane.showInputDialog(null,"Festivity?","Choose festivity", JOptionPane.QUESTION_MESSAGE, null, festivitiesNames, festivitiesNames[festivitiesNames.length - 1]);
						  String[] festivityGastronomies = bulgarianFestivities.getFestivityGastronomies(name);
						  String gastronomy = (String) JOptionPane.showInputDialog(null,"Which gastronomy do you want to change?","Choose gastronomy", JOptionPane.QUESTION_MESSAGE, null, festivityGastronomies, festivityGastronomies[festivityGastronomies.length - 1]);
						  String info = (String) JOptionPane.showInputDialog(null,"What do you want to update?","Choose information to update", JOptionPane.QUESTION_MESSAGE, null, gastronomyInfo, gastronomyInfo[gastronomyInfo.length - 1]);
						  bulgarianFestivities.updateFestivityGastronomy(name, gastronomy, info);
						}
					break;
				  case 5://Search festivities
					if (bulgarianFestivities.countFestivites() == 0) {
						JOptionPane.showMessageDialog(null, "No festivities have been added yet.");
					}else {
						region = (String) JOptionPane.showInputDialog(null,"Region?","Choose region", JOptionPane.QUESTION_MESSAGE, null, regions, regions[27]);
						String[] festivitiesByRegion = bulgarianFestivities.filterByRegion(region);
					    name = (String) JOptionPane.showInputDialog(null,"Festivity name?","Choose festivity", JOptionPane.QUESTION_MESSAGE, null, festivitiesByRegion, festivitiesByRegion[festivitiesByRegion.length - 1]);
					    bulgarianFestivities.displayFestivityDetails(name);
					}
					break;
					
				  case 6: //See users nationalities
					  JOptionPane.showMessageDialog(null, bulgarianFestivities.displayNationalities(countries));
					break;
				  default:
				    // code block
				}//end switch
				op = menuAdmin();
			}//end while
		}else {
			
			
			int opcao = Integer.parseInt(JOptionPane.showInputDialog("1. Login \n2. Register \n3. Sair"));
			
				while (opcao != 3){
					//Register user
					if(opcao == 2) {
						
						String username = JOptionPane.showInputDialog("Username?");
						while (bulgarianFestivities.registrationValidation(username) == false) {
							JOptionPane.showMessageDialog(null, "Username not available!");
							username = JOptionPane.showInputDialog("Username?");
						}
						
						String password = JOptionPane.showInputDialog("Password?");
						String country = (String) JOptionPane.showInputDialog(null,"Country?","Choose country", JOptionPane.QUESTION_MESSAGE, null, countries, countries[countries.length - 1]);
						User user = new User(username, password, country);
						bulgarianFestivities.registerUser(user);
						bulgarianFestivities.registrerNationality(country, countries);
					}
					//Login
					if (opcao == 1) {
						boolean authentication = false;
						while (authentication == false) {
							String username = JOptionPane.showInputDialog("Username?");
							String password = JOptionPane.showInputDialog("Password?");
							authentication = bulgarianFestivities.loginAuthentication(username, password);
							userPos = bulgarianFestivities.getUserPosition(username, password);
						}
						
						//Tourist functionalities
						op = menuUser();
						while(op != 2) {
							switch(op) {
							  case 1:
								  if (bulgarianFestivities.countFestivites() == 0) {
										JOptionPane.showMessageDialog(null, "No festivities have been added yet.");
									}else {
										String region = (String) JOptionPane.showInputDialog(null,"Region?","Choose region", JOptionPane.QUESTION_MESSAGE, null, regions, regions[27]);
										String[] festivitiesByRegion = bulgarianFestivities.filterByRegion(region);
									    String name = (String) JOptionPane.showInputDialog(null,"Festivity name?","Choose festivity", JOptionPane.QUESTION_MESSAGE, null, festivitiesByRegion, festivitiesByRegion[festivitiesByRegion.length - 1]);
									    bulgarianFestivities.displayFestivityDetails(name, userPos);
									}
							    break;
							  default:
							}//end switch
							op = menuUser();
						}//end while
					}
						
					
				opcao = Integer.parseInt(JOptionPane.showInputDialog("1. Login \n2. Register \n3. Sair"));
					
					
				}
			
				
			
			 
		
		}//end if
		 op = Integer.parseInt(JOptionPane.showInputDialog("1. Enter as admin\n2. Enter as tourist\n3. Exit"));
	  }//end while
	}//end main
	
	/**
	 * Admin menu
	 * @return opAdmin
	 */
	public static int menuAdmin() {
		int opAdmin = Integer.parseInt(JOptionPane.showInputDialog("1. Add festivity\n2. Register gastrinomic tradition\n3. Change festivity\n4. Change gastronomy\n5. Search\n6. Nationalities\n7. Exit"));
		return opAdmin;
	}//end menuAdmin
	
	/**
	 * Tourist menu
	 * @return opUser
	 */
	public static int menuUser() {
		 int opUser = Integer.parseInt(JOptionPane.showInputDialog("1. Search festivity\n2. Exit"));
		 return opUser;
	}//end menuUser

}//end Test
