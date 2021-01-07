package bonnet.airbnb.outils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author peterbardu
 *
 */

public class Utile {
	private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	/**
	 * Méthode qui permet de construire une date à partir d'une chaîne de caractères
	 * 
	 * @param strDate chaîne de caractères au format mm/dd/yyyy (ex : 01/07/2020 pour le 7 Janvier 2020)
	 * @return objet de type Date initialisé à la date passé en paramètre
	 */
	public static Date stringToDate(String strDate) {
		return new Date(strDate);
	}
	
	/**
	 * Méthode qui permet de formater une Date en String.
	 * 
	 * @param date a formater
	 * @return la chaîne de caractères au format mm/dd/yyyy (ex : 01/07/2020 pour le 7 Janvier 2020)
	 */
	public static String dateToString(Date date) {
		return simpleDateFormat.format(date);
	}
}
