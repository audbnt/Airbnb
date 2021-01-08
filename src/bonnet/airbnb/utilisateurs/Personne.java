package bonnet.airbnb.utilisateurs;

public class Personne {
	private String nom;
	private String prenom;
	private int age;
	
	public Personne(String pPrenom, String pNom, int pAge) {
		nom = pNom;
		prenom = pPrenom;
		setAge(pAge);
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	
	public void afficher() {
		System.out.print(prenom + " " + nom );
	}


}
