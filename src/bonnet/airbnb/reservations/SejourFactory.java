package bonnet.airbnb.reservations;

import java.util.Date;

import bonnet.airbnb.logements.Logement;

public class SejourFactory {
	private SejourFactory() {
	}
	
	public static Sejour getSejour(Date dateArrivee, int nbNuits, Logement logement, int nbVoyageurs) {
		Sejour sejour;

		if (nbNuits < 6) {
			sejour = new SejourCourt(dateArrivee, nbNuits, logement, nbVoyageurs);
		} else {
			sejour = new SejourLong(dateArrivee, nbNuits, logement, nbVoyageurs);
		}
		
		return sejour;
	}
}
