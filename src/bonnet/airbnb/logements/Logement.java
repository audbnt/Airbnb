package bonnet.airbnb.logements;

import bonnet.airbnb.utilisateurs.Hote;

public abstract class Logement {
	private Hote hote;
	private int tarifParNuit;
	private String adresse;
	private int superficie;
	private int superficieTotal;
	private int nbVoyageursMax;

	public Logement(Hote hote, int tarifParNuit, String adresse, int superficie, int nbVoyageursMax) {
		this.setHote(hote);
		this.tarifParNuit = tarifParNuit;
		this.setAdresse(adresse);
		this.superficie = superficie;
		this.nbVoyageursMax = nbVoyageursMax;
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
	
	public int getNbVoyageursMax() {
		return nbVoyageursMax;
	}
	
	public int getSuperficieTotal() {
		return superficieTotal;
	}

	public void afficher() {
		System.out.print("l'hôte ");
		getHote().afficher();
	}

}
