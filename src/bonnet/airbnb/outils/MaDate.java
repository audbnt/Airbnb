package bonnet.airbnb.outils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MaDate extends Date {
	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
	
	/*
	 * 
	 * 
	 */
	
	public MaDate(int jour, int mois, int annee) {
		super(annee - 1900 , mois - 1, jour);
	}
	
	@Override
	public String toString() {
		return DATE_FORMAT.format(this);
	}

}
