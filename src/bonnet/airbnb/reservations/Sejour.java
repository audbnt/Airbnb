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
		this.setNbVoyageurs(nbVoyageurs);
	}


	public int getNbVoyageurs() {
		return nbVoyageurs;
	}

	public void setNbVoyageurs(int nbVoyageurs) {
		this.nbVoyageurs = nbVoyageurs;
	}

	@Override
	public void afficher() {
		logement.afficher();
		System.out.println("La date d'arrivée : " + Utile.dateToString(dateArrivee));	
		
		int tarif = nbNuits * logement.getTarifParNuit();
		System.out.println("Le tarif est : " + tarif + " euros ");
	}


	@Override
	public boolean verificationDateArrivee() {
		// TODO Auto-generated method stub
		Date dateActuelle = new Date();
		
		return dateArrivee.after(dateActuelle);
	}


	@Override
	public boolean verificationNombreDeNuits() {
		// TODO Auto-generated method stub
		return nbNuits >= 1 && nbNuits <= 31 ;
	}


	@Override
	public boolean verificationNombreDeVoyageurs() {
		// TODO Auto-generated method stub
		return nbVoyageurs > 0 && nbVoyageurs <= Logement.getNbVoyageursMax();
	}
	
}
