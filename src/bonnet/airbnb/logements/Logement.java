package bonnet.airbnb.logements;

import bonnet.airbnb.utilisateurs.Hote;

public class Logement {
	private Hote hote;
	private int tarifParNuit;
	private String adresse;
	private int superficie;
	private int nbVoyageursMax;

	public Logement(Hote hote, int tarifParNuit, String adresse, int superficie, int nbVoyageursMax) {
		this.hote = hote;
		this.tarifParNuit = tarifParNuit;
		this.adresse = adresse;
		this.superficie = superficie;
		this.nbVoyageursMax = nbVoyageursMax;
	}
	
	public Hote getHote() {
		return hote ;
	}

	public int getTarifParNuit() {
		return tarifParNuit;
	}
	
	public String getAdresse() {
		return adresse;
	}
	
	public int getSuperficie() {
		return superficie;
	}
	
	public int getNbVoyageursMax() {
		return nbVoyageursMax;
	}

	public void afficher() {
		System.out.print("l'hôte ");
		hote.afficher();
		System.out.println(".");		
		System.out.println("L'adresse : " + adresse);
	}

}
