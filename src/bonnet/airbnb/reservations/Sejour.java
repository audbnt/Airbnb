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
		this.setdateArrivee(dateArrivee);
		this.setNbNuits(nbNuits);
		this.setlogement(logement);
		this.setNbVoyageurs(nbVoyageurs);
	}
	
	
	public int getNbNuits() {
		return nbNuits;
	}
	
	public int setNbNuits(int nbNuits) {
		return this.nbNuits = nbNuits;
	}
	
	public int getNbVoyageurs() {
		return nbVoyageurs;
	}
	
	public int setNbVoyageurs(int nbVoyageurs) {
		return this.nbVoyageurs = nbVoyageurs;
	}
	
	public Date getdateArrivee() {
		return dateArrivee;
	}
	
	public Date setdateArrivee(Date dateArrivee) {
		return this.dateArrivee = dateArrivee;
	}
	
	public Logement getlogement() {
		return logement;
	}
	
	public Logement setlogement(Logement logement) {
		return this.logement = logement;
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
