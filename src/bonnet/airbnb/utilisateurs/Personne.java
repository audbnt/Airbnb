package bonnet.airbnb.utilisateurs;

public class Personne {
	private static String nom;
	private static String prenom;
	private static int age;
	
	public Personne(String pPrenom, String pNom, int pAge) {
		nom = pNom;
		prenom = pPrenom;
		age = pAge;
	}
	
	public static String getNom() {
		return nom;
	}
	
	public static String getPrenom() {
		return prenom;
	}
	
	public static int getAge() {
		return age;
	}
	
	
	public static void afficher() {
		System.out.print(prenom + " " + nom );
		
	}
}
