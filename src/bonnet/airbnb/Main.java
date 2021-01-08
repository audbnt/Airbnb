package bonnet.airbnb;

import java.util.Date;

import bonnet.airbnb.logements.Appartement;
import bonnet.airbnb.logements.Logement;
import bonnet.airbnb.logements.Maison;
import bonnet.airbnb.outils.MaDate;
import bonnet.airbnb.outils.Utile;
import bonnet.airbnb.reservations.Reservation;
import bonnet.airbnb.reservations.Sejour;
import bonnet.airbnb.reservations.SejourCourt;
import bonnet.airbnb.reservations.SejourLong;
import bonnet.airbnb.utilisateurs.Hote;
import bonnet.airbnb.utilisateurs.Voyageur;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// ----------------------------------------------------
				// Données - Personnes et Logements
				Hote hote1 = new Hote("Peter", "Bardu", 31, 12);
				Hote hote2 = new Hote("Michel", "Jordan", 34, 1);
				Voyageur voyageur1 = new Voyageur("Jean", "Mi", 24);
				Voyageur voyageur2 = new Voyageur("Emma", "Martin", 31);

				Maison maison = new Maison(hote1, 100, "81 rue Colbert", 60, 4, 1000, true);
				Appartement appartement1 = new Appartement(hote1, 60, "83 rue Colbert", 60, 4, 2, 10);
				Appartement appartement2 = new Appartement(hote2, 130, "85 rue Colbert", 60, 4, 1, 0);

				// ----------------------------------------------------
				// Critère de séjour

				// Date dateArrivee = Utile.stringToDate("01/07/2020");
				Date dateArrivee = new MaDate(9, 1, 2020);
				int nbNuits = 2;
				int nbVoyageurs = 2;
				Logement logement = maison;

				Sejour sejour;
				
				if (nbNuits < 6) {
					sejour = new SejourCourt(dateArrivee, nbNuits, logement, nbVoyageurs);
				} else {
					sejour = new SejourLong(dateArrivee, nbNuits, logement, nbVoyageurs);
				}
				
				Reservation reservation = new Reservation(0, sejour, voyageur1);
				reservation.afficher();
				
		
		
	}

}
