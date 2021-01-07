package bonnet.airbnb.logements;

import bonnet.airbnb.utilisateurs.Hote;

public class Appartement extends Logement {
	private int numeroEtage ;
	private int superficieBalcon ;
	public Appartement(Hote hote, int tarifParNuit, String adresse, int superficie, int nbVoyageursMax, int numeroEtage,
			int superficieBalcon) {
		super(hote, tarifParNuit, adresse, superficie, nbVoyageursMax);
		this.numeroEtage = numeroEtage;
		this.superficieBalcon = superficieBalcon;
	}
	
	public static void afficher() {
		System.out.print("un appartement situé ");
	}

}
