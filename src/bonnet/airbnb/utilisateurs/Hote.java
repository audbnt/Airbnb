package bonnet.airbnb.utilisateurs;


public class Hote extends Personne {
	private static int delaiDeReponse ;
	
	public Hote(String pPrenom, String pNom, int pAge, int delaiDeReponse) {
		super(pPrenom, pNom, pAge);
		Hote.delaiDeReponse = delaiDeReponse;
	}
	
	public int getDelaiDeReponse() {
		return delaiDeReponse;
	}

	public static void afficher() {
		
		if(delaiDeReponse > 1) {
			
			Personne.afficher();
			System.out.print("qui s'engage à répondre dans les "+ delaiDeReponse+" heures.");
			
			
		}else if(delaiDeReponse == 1) {
			
			
			Personne.afficher();
			System.out.print("qui s'engage à répondre dans l'heure.");
			
		}
			
	}
}
