package bonnet.airbnb.outils;

import java.util.ArrayList;

import bonnet.airbnb.logements.Logement;
import bonnet.airbnb.utilisateurs.Hote;

public class AirbnbData {
	
	private static AirbnbData INSTANCE = new AirbnbData();

	private ArrayList<Logement> logements;
	private ArrayList<Hote> hotes;
	

	private AirbnbData() {
		logements = new ArrayList<>();
		hotes = new ArrayList<>();
		
		ParserLogementsXML.parse("logements.xml", hotes, logements);
	}
	
	public static AirbnbData getINSTANCE() {
		
	
		return INSTANCE;
	}

	public ArrayList<Logement> getLogements() {
		return logements;
	}
	

}
