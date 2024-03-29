package bonnet.airbnb.utilisateurs;

import bonnet.airbnb.outils.Comparable;
public final class Hote extends Personne implements Comparable {

		private final int delaiReponse;

		public Hote(String pPrenom, String pNom, int pAge, int pDelaiReponse) {
			super(pPrenom, pNom, pAge);
			delaiReponse = pDelaiReponse;
		}

		@Override
		public void afficher() {
			super.afficher();
			System.out.print(" qui s'engage à répondre dans les " + delaiReponse + " heures");
		}

		@Override
		public boolean equals(Object obj) {

			if (obj instanceof Hote) {
				Hote hote = (Hote) obj;
				return super.equals(hote) && this.delaiReponse == hote.delaiReponse;
			}

			return false;
		}

		@Override
		public int getValueToCompare() {
			return delaiReponse;
		}
}

