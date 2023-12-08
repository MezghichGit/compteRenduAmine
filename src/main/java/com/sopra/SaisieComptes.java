package com.sopra;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;


public class SaisieComptes {

	public static void main(String[] args) {
		System.out.println("Welcome to Our Bank");
		
		Scanner scanner = new Scanner(System.in);
		
		// faire la saisie de deux comptes
		
		
		 //System.out.println(newAccount(scanner,"Courant"));
		 CompteBancaire cbCourant = newAccount(scanner,"Courant");
		 CompteBancaire cbEpargne = newAccount(scanner,"Epargne");
		 System.out.println("****");
		 //System.out.println(newAccount(scanner,"Epargne"));
		//faire la sauvegarde dans un fichier xml
		// Lecture en dur
				 try {
					    // création de l'element racine en mémoire  de type Document
			            Document doc = new Document();
			            // création de l'élément racine : CompteBancaires
			            doc.setRootElement(new Element("CompteBancaires"));
			            
			            doc.getRootElement().addContent(createCompteBancaireXMLElement(cbCourant));
			            doc.getRootElement().addContent(createCompteBancaireXMLElement(cbEpargne));
			            
			            //XmlOutputter : objet pour ecrire dans un fichier .xml
			            XMLOutputter xmlOutput = new XMLOutputter();
			            xmlOutput.setFormat(Format.getPrettyFormat());
			            xmlOutput.output(doc, new FileWriter("banque.xml"));
			            System.out.println("File Saved!");
			       }
				 catch (IOException io) {
			            System.out.println(io.getMessage());
			        }
		//faire le lecture des comptes bancaires

	}
	
	private static Element createCompteBancaireXMLElement(CompteBancaire compteBancaire) {
        Element cbElement = new Element("CompteBancaire");
        
        cbElement.addContent(new Element("numero").setText(""+compteBancaire.getNumCompte()));
        cbElement.addContent(new Element("proprietaire").setText(compteBancaire.getProprietaire()));
        cbElement.addContent(new Element("type").setText(""+compteBancaire.getTypeCompte()));
        cbElement.addContent(new Element("dateCreation").setText(""+compteBancaire.getDateCreate()));
        return cbElement;
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
