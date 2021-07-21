package bonnet.airbnb.logements;

import bonnet.airbnb.utilisateurs.Hote;

public final class Appartement extends Logement {
	
	private final int numeroEtage ;
	private final int superficieBalcon ;
	

	public Appartement(String string, Hote hote, int tarifParNuit, String adresse, int superficie, int nbVoyageursMax, int numeroEtage,
			int superficieBalcon) {
		super(hote, tarifParNuit, adresse, superficie, nbVoyageursMax);
		this.numeroEtage = numeroEtage;
		this.superficieBalcon = superficieBalcon;
	}

	public int getNumeroEtage() {
		return numeroEtage;
	}

	public int getSuperficieBalcon() {
		return superficieBalcon;
	}
	
	@Override
	public void afficher() {
		super.afficher();
		System.out.println("Je suis un appartement");
		
	}

	@Override
	public int getSuperficieTotale() {
		return superficieBalcon + getSuperficie();
	}

	
}
