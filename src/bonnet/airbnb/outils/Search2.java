package bonnet.airbnb.outils;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.*;

import bonnet.airbnb.logements.Appartement;
import bonnet.airbnb.logements.Logement;
import bonnet.airbnb.logements.Maison;

public class Search2 {
	private static final int YES = 1;
	private static final int NO = 2;
	private static final int WE_DONT_CARE = 3;

	private int nbVoyageurs;
	private int tarifMin;
	private int tarifMax;
	private int possedePiscine;
	private int possedeJardin;
	private int possedeBalcon;

	private Search2(SearchBuilder builder) {
		this.nbVoyageurs = builder.nbVoyageursBuilder;
		this.tarifMin = builder.tarifMinBuilder;
		this.tarifMax = builder.tarifMaxBuilder;
		this.possedePiscine = builder.possedePiscineBuilder;
		this.possedeJardin = builder.possedeJardinBuilder;
		this.possedeBalcon = builder.possedeBalconBuilder;
	}

	public ArrayList<Logement> result() {

		ArrayList<Logement> result = new ArrayList<>();
		
		Predicate<? super Logement> predicate = null;
		result.stream().filter(predicate);

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

		public Search2 build() {
			return new Search2(this);
		}

	}
}
