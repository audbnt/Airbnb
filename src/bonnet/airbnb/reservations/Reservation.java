package bonnet.airbnb.reservations;

import java.util.Date;

import bonnet.airbnb.utilisateurs.Voyageur;

public class Reservation {
	private int identifiant;
	private Sejour sejour;
	private Voyageur voyageur;
	private boolean estValidee;
	private Date dateDeReservation;

	public Reservation(int identifiant, Sejour sejour, Voyageur voyageur) {
		this.setIdentifiant(identifiant);
		this.sejour = sejour;
		this.voyageur = voyageur;
		setEstValidee(false);
		setDateDeReservation(new Date());
	}

	public void afficher() {
		voyageur.afficher();
		System.out.print(" qui a fait une réservation chez ");
		sejour.afficher();
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public boolean isEstValidee() {
		return estValidee;
	}

	public void setEstValidee(boolean estValidee) {
		this.estValidee = estValidee;
	}

	public Date getDateDeReservation() {
		return dateDeReservation;
	}

	public void setDateDeReservation(Date dateDeReservation) {
		this.dateDeReservation = dateDeReservation;
	}
}
