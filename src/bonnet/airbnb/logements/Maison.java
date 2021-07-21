package bonnet.airbnb.logements;

import bonnet.airbnb.utilisateurs.Hote;

public final class Maison extends Logement {
	private final int superficieJardin ;
	private final boolean possedePiscine ;
	
	public Maison(String string, Hote hote, int tarifParNuit, String adresse, int superficie, int nbVoyageursMax, int superficieJardin,
			boolean possedePiscine) {
		super(hote, tarifParNuit, adresse, superficie, nbVoyageursMax);
		this.superficieJardin = superficieJardin;
		this.possedePiscine = possedePiscine;
	}


	public int getSuperficieJardin() {
		return superficieJardin;
	}

	public boolean isPossedePiscine() {
		return possedePiscine;
	}
	
	@Override
	public void afficher() {
		super.afficher();
		System.out.println("Je suis une maison");
	}
	
	@Override
	public int getSuperficieTotale() {
		return superficieJardin + getSuperficie();
	}
	
	
	
}
