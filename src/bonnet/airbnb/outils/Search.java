package bonnet.airbnb.outils;

import java.util.ArrayList;

import bonnet.airbnb.logements.Appartement;
import bonnet.airbnb.logements.Logement;
import bonnet.airbnb.logements.Maison;

public class Search {
	private static final int YES = 1;
	private static final int NO = 2;
	private static final int WE_DONT_CARE = 3;

	private int nbVoyageurs;
	private int tarifMin;
	private int tarifMax;
	private int possedePiscine;
	private int possedeJardin;
	private int possedeBalcon;

	private Search(SearchBuilder builder) {
		this.nbVoyageurs = builder.nbVoyageursBuilder;
		this.tarifMin = builder.tarifMinBuilder;
		this.tarifMax = builder.tarifMaxBuilder;
		this.possedePiscine = builder.possedePiscineBuilder;
		this.possedeJardin = builder.possedeJardinBuilder;
		this.possedeBalcon = builder.possedeBalconBuilder;
	}

	public ArrayList<Logement> result() {

		ArrayList<Logement> result = new ArrayList<>();

		for (Logement logement : AirbnbData.getINSTANCE().getLogements()) {

			// Test nombre de voyageur
			if (logement.getNbVoyageursMax() < nbVoyageurs)
				continue;

			// Test du tarif par nuit
			if (logement.getTarifParNuit() < tarifMin || logement.getTarifParNuit() > tarifMax)
				continue;

			// Test pour la piscine
			if (possedePiscine == YES) {
				// Oui pour la piscine du coup c'est forcément une maison
				if (logement instanceof Maison) {
					Maison maison = (Maison) logement;
					// La maison n'a pas de piscine, on ne la prend pas
					if (!maison.isPossedePiscine())
						continue;
				} else
					continue;

			} else if (possedePiscine == NO) {
				// Non pour la piscine
				if (logement instanceof Maison) {
					Maison maison = (Maison) logement;
					// Si la maison a une piscine, on ne la prend pas
					if (maison.isPossedePiscine())
						continue;
				}
			}

			// Test pour le jardin
			if (possedeJardin == YES) {
				// Oui pour le jardin du coup c'est forcément une maison
				if (logement instanceof Maison) {
					Maison maison = (Maison) logement;
					// Si la maison n'a pas de jardin, on ne la prend pas
					if (maison.getSuperficieJardin() == 0)
						continue;
				} else
					continue;
			} else if (possedeJardin == NO) {
				// Non pour le jardin
				if (logement instanceof Maison) {
					Maison maison = (Maison) logement;
					// Si la maison a un jardin, on ne la prend pas
					if (maison.getSuperficieJardin() != 0)
						continue;
				}
			}

			// Test pour le balcon
			if (possedeBalcon == YES) {
				// Oui pour le balcon, c'est forcément un appartement
				if (logement instanceof Appartement) {
					Appartement appartement = (Appartement) logement;
					// Si l'appartement n'a pas de balcon, on ne le prend pas
					if (appartement.getSuperficieBalcon() == 0)
						continue;
				} else
					continue;
			} else if (possedeBalcon == NO) {
				// Non pour le balcon
				if (logement instanceof Appartement) {
					Appartement appartement = (Appartement) logement;
					// Si l'appartement a pas un balcon, on ne le prend pas
					if (appartement.getSuperficieBalcon() != 0)
						continue;
				}

			}

			result.add(logement);
		}

		return result;
	}

	public static class SearchBuilder {

		private final int nbVoyageursBuilder;
		private int tarifMinBuilder;
		private int tarifMaxBuilder;
		private int possedePiscineBuilder;
		private int possedeJardinBuilder;
		private int possedeBalconBuilder;

		public SearchBuilder(int nbVoyageurs) {
			this.nbVoyageursBuilder = nbVoyageurs;
			tarifMinBuilder = 0;
			tarifMaxBuilder = Integer.MAX_VALUE;
			possedePiscineBuilder = WE_DONT_CARE;
			possedeJardinBuilder = WE_DONT_CARE;
			possedeBalconBuilder = WE_DONT_CARE;
		}

		public SearchBuilder tarifMinBuilder(int tarifMin) {
			this.tarifMinBuilder = tarifMin;
			return this;
		}

		public SearchBuilder tarifMaxBuilder(int tarifMax) {
			this.tarifMaxBuilder = tarifMax;
			return this;
		}

		public SearchBuilder possedePiscine(boolean possedePiscine) {
			this.possedePiscineBuilder = possedePiscine ? YES : NO;
			return this;
		}

		public SearchBuilder possedeJardin(boolean possedeJardin) {
			this.possedeJardinBuilder = possedeJardin ? YES : NO;
			return this;
		}

		public SearchBuilder possedeBalcon(boolean possedeBalcon) {
			this.possedeBalconBuilder = possedeBalcon ? YES : NO;
			return this;
		}

		public Search build() {
			return new Search(this);
		}

	}
}
