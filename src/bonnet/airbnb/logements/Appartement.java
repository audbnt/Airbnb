package bonnet.airbnb.logements;

import bonnet.airbnb.utilisateurs.Hote;

public class Appartement extends Logement {
	private int numeroEtage ;
	private int superficieBalcon ;
	public Appartement(Hote hote, int tarifParNuit, String adresse, int superficie, int nbVoyageursMax, int numeroEtage,
			int superficieBalcon) {
		super(hote, tarifParNuit, adresse, superficie, nbVoyageursMax);
		this.setNumeroEtage(numeroEtage);
		this.setSuperficieBalcon(superficieBalcon);
	}
	

	public int getNumeroEtage() {
		return numeroEtage;
	}

	public void setNumeroEtage(int numeroEtage) {
		this.numeroEtage = numeroEtage;
	}

	public int getSuperficieBalcon() {
		return superficieBalcon;
	}

	public void setSuperficieBalcon(int superficieBalcon) {
		this.superficieBalcon = superficieBalcon;
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
