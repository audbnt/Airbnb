package bonnet.airbnb.utilisateurs;

import bonnet.airbnb.outils.Comparable;

public class Personne implements Comparable{
	private String nom;
	private String prenom;
	private final int age;

	public Personne(String pPrenom, String pNom, int pAge) {
		nom = pNom;
		prenom = pPrenom;
		age = pAge;
	}

	public void afficher() {
		System.out.print(prenom + " " + nom);
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Personne) {

			Personne personne = (Personne) obj;

			return this.prenom.equals(personne.prenom) &&
					this.nom.equals(personne.nom) &&
					this.age == personne.age;
		}

		return false;
	}

	@Override
	public int getValueToCompare() {
		return age;
	}


}
