package bonnet.airbnb.outils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MaDate extends Date {
	private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		
		/**
		 * 
		 * @param jour entre 1 et 31
		 * @param mois entre 1 et 12 pour 1 : mois de janvier
		 * @param annee au format yyyy (ex: 2020)
		 */
		public MaDate(int jour, int mois, int annee) {
			super(annee - 1900, mois - 1, jour);
		}
		
		/**
		 * 
		 * @return au format dd/MM/yyyy
		 */
		@Override
		public String toString() {
			return simpleDateFormat.format(this);
		}

}
