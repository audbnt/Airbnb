package bonnet.airbnb.reservations;

import java.util.Date;

import bonnet.airbnb.logements.Logement;

public class SejourCourt extends Sejour implements ConditionTarifaireInterface {
	private int tarif;

	public SejourCourt(Date dateArrivee, int nbNuits, Logement logement, int nbVoyageurs) {
		super(dateArrivee, nbNuits, logement, nbVoyageurs);
		this.tarif =  nbNuits * logement.getTarifParNuit();
	}
	
	@Override
	public void afficher() {	
		super.afficher();
		System.out.println("Le tarif est : " + tarif + " euros ");
	}

	@Override
	public boolean benefiniePromotion() {
		return false;
	}

	@Override
	public int getTarif() {
		return tarif;
	}
}
