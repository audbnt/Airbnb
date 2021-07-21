package bonnet.airbnb;

import java.util.ArrayList;
import java.util.Date;

import bonnet.airbnb.logements.Appartement;
import bonnet.airbnb.logements.Logement;
import bonnet.airbnb.logements.Maison;
import bonnet.airbnb.outils.AirbnbData;
import bonnet.airbnb.outils.MaDate;
import bonnet.airbnb.outils.Search;
import bonnet.airbnb.reservations.Reservation;
import bonnet.airbnb.reservations.Sejour;
import bonnet.airbnb.reservations.SejourCourt;
import bonnet.airbnb.reservations.SejourFactory;
import bonnet.airbnb.reservations.SejourLong;
import bonnet.airbnb.utilisateurs.Hote;
import bonnet.airbnb.utilisateurs.Voyageur;


public class Main {

	public static void main(String[] args) {

		 
		
		// ----------------------------------------------------
		// Données - Personnes et Logements
		Hote hote1 = new Hote(null, "Bardu", 31, 12);
		Hote hote2 = new Hote("Michel", "Jordan", 34, 1);
		Voyageur voyageur1 = new Voyageur("Jean", "Mi", 24);
		Voyageur voyageur2 = new Voyageur("Emma", "Martin", 31);

		Logement maison = new Maison("Maison 21", hote1, 100, "81 rue Colbert", 60, 4, 1000, true);
		Logement appartement1 = new Appartement("Appart 231", hote1, 60, "83 rue Colbert", 60, 4, 2, 10);
		Logement appartement2 = new Appartement("Appart 232", hote2, 1300, "85 rue Colbert", 60, 4, 1, 0);
		AirbnbData.getINSTANCE().getLogements().add(maison);
		AirbnbData.getINSTANCE().getLogements().add(appartement1);
		AirbnbData.getINSTANCE().getLogements().add(appartement2);
		
		for (Logement logement : AirbnbData.getINSTANCE().getLogements()) {
			logement.afficher();
		}
		
		
		// ----------------------------------------------------
		// Critère de séjour
		Date dateArrivee = new MaDate(9, 3, 2020);
		int nbNuits = 3;
		int nbVoyageurs = 2;
		Logement logement = maison;

		Sejour sejour = SejourFactory.getSejour(dateArrivee, nbNuits, logement, nbVoyageurs);
		

		try {
			Reservation reservation = new Reservation(0, sejour, voyageur1);
			// reservation.afficher();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		
		
		// Création de la recherche
		Search search = new Search.SearchBuilder(2).tarifMinBuilder(50).possedePiscine(true).build();
		
		// TODO Le résultat 
		ArrayList<Logement> result = search.result();
		
		for (Logement l : result) {
			l.afficher();
		}
		
		

	}

}
