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
	
	public void afficher() {
		super.afficher();
		System.out.print("Le logement est une maison située "+ getAdresse());
		if(getNumeroEtage() == 0) {
			System.out.println(" au rez-de-chaussée.");
		}else if(getNumeroEtage() == 1) {
			System.out.println(" au 1er étage.");
		}else {
			System.out.println(" au "+getNumeroEtage()+"ème étage.");
		}
		System.out.println("Superficie : "+ getSuperficie() +"m2");
		System.out.print("Balcon : ");
		if(getSuperficieBalcon()>0) {
			System.out.println("Oui ("+getSuperficieBalcon()+"m2)");
		}else {
			System.out.println("Non");
		}
	}

}
