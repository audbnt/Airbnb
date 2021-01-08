package bonnet.airbnb.reservations;

import java.util.Date;

import bonnet.airbnb.logements.Logement;

public class SejourLong extends Sejour implements ConditionTarifaireInterface {
	private static final int PROMOTION_EN_POURCENTAGE = 20;
	private int tarif;
	private int promotion;

	public SejourLong(Date dateArrivee, int nbNuits, Logement logement, int nbVoyageurs) {
		super(dateArrivee, nbNuits, logement, nbVoyageurs);

		int tarifInitial = nbNuits * logement.getTarifParNuit();
		promotion = tarifInitial * PROMOTION_EN_POURCENTAGE / 100;
		tarif = tarifInitial - promotion;
	}

	@Override
	public void afficher() {
		super.afficher();
		
		System.out.println("Le tarif est : " + tarif + " euros dont " + promotion + " euros de promotion");
	}
	
	@Override
	public boolean benefiniePromotion() {
		return true;
	}

	@Override
	public int getTarif() {
		return tarif;
	}
}
