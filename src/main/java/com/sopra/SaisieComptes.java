package com.sopra;

import java.util.Date;
import java.util.Scanner;

public class SaisieComptes {

	public static void main(String[] args) {
		System.out.println("Welcome to Our Bank");
		
		Scanner scanner = new Scanner(System.in);
		
		// faire la saisie de deux comptes
		
		
		 System.out.println(newAccount(scanner,"Courant"));
		 System.out.println("****");
		 System.out.println(newAccount(scanner,"Epargne"));
		//faire la sauvegarde dans un fichier xml
		
		
		//faire le lecture des comptes bancaires

	}
	
	public static CompteBancaire newAccount(Scanner scanner, String typeCompte) {
		
		CompteBancaire cb = new CompteBancaire();
		
		System.out.println("Donner le numéro de compte");
		int numCompte = scanner.nextInt();
		cb.setNumCompte(numCompte);
		
		System.out.println("Donner le nom du proprietaire du compte");
		String nom = scanner.next();
		cb.setProprietaire(nom);
		
		System.out.println("Donner le solde initial");
		double solde = scanner.nextDouble();
		cb.setSolde(solde);
		
		//System.out.println("Donner le type de compte : Epargne ou Courant");
		//String typeCompte = scanner.next();
		cb.setTypeCompte(typeCompte);
		
		cb.setDateCreate(new Date());
		
		return cb;
		
		
	}

}
