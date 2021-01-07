package bonnet.airbnb.logements;

import bonnet.airbnb.utilisateurs.Hote;

public abstract class Logement {
	private Hote hote;
	private int tarifParNuit;
	private String adresse;
	private int superficie;
	private int superficieTotal;
	private static int nbVoyageursMax;

	public Logement(Hote hote, int tarifParNuit, String adresse, int superficie, int nbVoyageursMax) {
		this.setHote(hote);
		this.tarifParNuit = tarifParNuit;
		this.setAdresse(adresse);
		this.setSuperficie(superficie);
		this.setNbVoyageursMax(nbVoyageursMax);
	}
	
	public Hote getHote() {
		return hote;
	}

	public void setHote(Hote hote) {
		this.hote = hote;
	}

	public int getTarifParNuit() {
		return tarifParNuit;
	}
	
	public String getAdresse() {
		return adresse;
	}
	
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public int getSuperficieTotal() {
		return superficieTotal;
	}

	public void setSuperficieTotal(int superficieTotal) {
		this.superficieTotal = superficieTotal;
	}

	public static int getNbVoyageursMax() {
		return nbVoyageursMax;
	}

	public void setNbVoyageursMax(int nbVoyageursMax) {
		this.nbVoyageursMax = nbVoyageursMax;
	}
	

	public void afficher() {
		System.out.print("l'hôte ");
		getHote().afficher();
	}

	

}
