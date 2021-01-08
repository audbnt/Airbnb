package bonnet.airbnb.reservations;

import java.util.Date;

import bonnet.airbnb.logements.Logement;
import bonnet.airbnb.outils.Utile;

public class Sejour implements SejourInterface {

	private Date dateArrivee;
	private int nbNuits;
	private Logement logement;
	private int nbVoyageurs;

	public Sejour(Date dateArrivee, int nbNuits, Logement logement, int nbVoyageurs) {
		this.dateArrivee = dateArrivee;
		this.nbNuits = nbNuits;
		this.logement = logement;
		this.nbVoyageurs = nbVoyageurs;
	}

	@Override
	public void afficher() {
		logement.afficher();
		System.out.println("La date d'arrivée : " + dateArrivee);

	}

	@Override
	public boolean verficationDateArrivee() {
		Date dateCourante = new Date();
		return dateCourante.before(dateArrivee);
	}

	@Override
	public boolean verificationNombreDeNuits() {
		return nbNuits >= 1 && nbNuits <= 31;
	}

	@Override
	public boolean verificationNombreDeVoyageurs() {
		return nbVoyageurs >= 1 && nbVoyageurs <= logement.getNbVoyageursMax();
	}
	
}
