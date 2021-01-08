package bonnet.airbnb.menu;

import java.util.Scanner;

public class Menu {
	
	static Scanner scanner ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Bienvenu chez AirBnB");
		
		scanner = new Scanner(System.in);
		
		//scanner.useDelimiter("\n");
		listerMenu();
		
		scanner.close();

	}
	
	public static void listerMenu() {
		System.out.println("---------------------------");
		System.out.println("Saisir une option : ");
		System.out.println("1 : Liste des hôtes ");
		System.out.println("2 : Liste des logements ");
		System.out.println("3 : Liste des voyageurs ");
		System.out.println("4 : Liste des réservations ");
		System.out.println("5 : Fermer le programme ");
		int choice = scanner.nextInt();
		System.out.println("Vous avez choisit l'option : "+ choice);
	}

}
