package bonnet.airbnb;

import java.util.Date;

import bonnet.airbnb.logements.Logement;
import bonnet.airbnb.outils.Utile;
import bonnet.airbnb.reservations.Reservation;
import bonnet.airbnb.reservations.Sejour;
import bonnet.airbnb.utilisateurs.Hote;
import bonnet.airbnb.utilisateurs.Voyageur;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// ----------------------------------------------------
		// Données - Personnes et Logements
		Hote personne1 = new Hote("Audrey", "Bonnet", 31, 12);
		Hote personne2 = new Hote("Michel", "Jordan", 34, 11);
		Voyageur personne3 = new Voyageur("Jean", "Mi", 24);
		Voyageur personne4 = new Voyageur("Emma", "Martin", 31);

		Logement logement1 = new Logement(personne1, 100, "81 rue Colbert", 60, 4);
		Logement logement2 = new Logement(personne1, 60, "83 rue Colbert", 60, 4);
		Logement logement3 = new Logement(personne2, 130, "85 rue Colbert", 60, 4);

		// ----------------------------------------------------
		// Critère de séjour
		Date dateArrivee = Utile.stringToDate("01/07/2020");
		int nbNuits = 2;
		int nbVoyageurs = 2;
		Logement logement = logement2;

		Sejour sejour = new Sejour(dateArrivee, nbNuits, logement, nbVoyageurs);

		Reservation reservation = new Reservation(0, sejour, personne3);
		
		
		Hote.afficher();
		
		
	}

}
