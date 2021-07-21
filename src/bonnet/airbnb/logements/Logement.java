package bonnet.airbnb.logements;

import java.util.Optional;

import bonnet.airbnb.utilisateurs.Hote;
import bonnet.airbnb.outils.Comparable;

public abstract class Logement implements Comparable{

	private String name;

	private final Hote hote;
	private final int tarifParNuit;
	private String adresse;
	private final int superficie;
	private final int nbVoyageursMax;

	public Logement(Hote hote, int tarifParNuit, String adresse, int superficie, int nbVoyageursMax) {
		super();
		this.hote = hote;
		this.tarifParNuit = tarifParNuit;
		this.adresse = adresse;
		this.superficie = superficie;
		this.nbVoyageursMax = nbVoyageursMax;
		this.name = "";
	}

	public int getTarifParNuit() {
		return tarifParNuit;
	}

	public int getSuperficie() {
		return superficie;
	}

	public int getNbVoyageursMax() {
		return nbVoyageursMax;
	}


	public void afficher() {
		hote.afficher();
		System.out.println(".");
		System.out.println("L'adresse : " + adresse);
	}

	public abstract int getSuperficieTotale();

	public String getName() {
		return name;
	}
	

	public String setName(String n) {
		return this.name = n;
	}

	@Override
	public int getValueToCompare() {
		return tarifParNuit;
	}

}
