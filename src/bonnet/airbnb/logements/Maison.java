package bonnet.airbnb.logements;

import bonnet.airbnb.utilisateurs.Hote;

public class Maison extends Logement {
	private int superficieJardin ;
	private boolean possedePiscine ;
	public Maison(Hote hote, int tarifParNuit, String adresse, int superficie, int nbVoyageursMax, int superficieJardin,
			boolean possedePiscine) {
		super(hote, tarifParNuit, adresse, superficie, nbVoyageursMax);
		this.superficieJardin = superficieJardin;
		this.possedePiscine = possedePiscine;
	}
	
	
}
