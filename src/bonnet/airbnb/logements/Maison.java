package bonnet.airbnb.logements;

import bonnet.airbnb.utilisateurs.Hote;

public class Maison extends Logement {
	private int superficieJardin ;
	private boolean possedePiscine ;
	public Maison(Hote hote, int tarifParNuit, String adresse, int superficie, int nbVoyageursMax, int superficieJardin,
			boolean possedePiscine) {
		super(hote, tarifParNuit, adresse, superficie, nbVoyageursMax);
		this.setSuperficieJardin(superficieJardin);
		this.setPossedePiscine(possedePiscine);
	}


	public int getSuperficieJardin() {
		return superficieJardin;
	}


	public void setSuperficieJardin(int superficieJardin) {
		this.superficieJardin = superficieJardin;
	}


	public boolean isPossedePiscine() {
		return possedePiscine;
	}


	public void setPossedePiscine(boolean possedePiscine) {
		this.possedePiscine = possedePiscine;
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
