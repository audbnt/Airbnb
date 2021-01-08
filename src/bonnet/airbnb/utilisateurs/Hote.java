package bonnet.airbnb.utilisateurs;


public class Hote extends Personne {
	private int delaiDeReponse ;
	
	public Hote(String pPrenom, String pNom, int pAge, int delaiDeReponse) {
		super(pPrenom, pNom, pAge);
		this.setDelaiDeReponse(delaiDeReponse);
	}



	public int getDelaiDeReponse() {
		return delaiDeReponse;
	}

	public void setDelaiDeReponse(int delaiDeReponse) {
		this.delaiDeReponse = delaiDeReponse;
	}
	

	@Override
	public void afficher() {
		super.afficher();
		System.out.print(" qui s'engage à répondre dans les " + delaiDeReponse + " heures");
	}
	
	
}
