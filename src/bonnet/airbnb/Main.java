package bonnet.airbnb;

import java.util.Date;

import bonnet.airbnb.logements.Appartement;
import bonnet.airbnb.logements.Logement;
import bonnet.airbnb.logements.Maison;
import bonnet.airbnb.outils.MaDate;
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
		Hote hote1 = new Hote("Audrey", "Bonnet", 31, 12);
		Hote hote2 = new Hote("Michel", "Jordan", 34, 11);
		Voyageur voyageur1 = new Voyageur("Jean", "Mi", 24);
		Voyageur voyageur2 = new Voyageur("Emma", "Martin", 31);

		Maison Maison1 = new Maison(hote1, 100, "81 rue Colbert", 60, 4, 1000, true);
		Appartement Appartement1 = new Appartement(hote2, 130, "85 rue Colbert", 60, 4, 10, 4);

		// ----------------------------------------------------
		// Critère de séjour
		Date dateArrivee = new MaDate(7, 1, 2021);
		int nbNuits = 2;
		int nbVoyageurs = 2;
		Logement logement = Maison1;

		Sejour sejour = new Sejour(dateArrivee, nbNuits, logement, nbVoyageurs);
		
		// Création réservation

		Reservation reservation = new Reservation(0, sejour, voyageur2);
		reservation.afficher();
		
		
	}

}
