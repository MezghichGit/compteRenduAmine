package com.sopra;
import java.sql.*;
import java.util.Scanner;
public class JDBC {
	
	public static void main(String[] args) throws SQLException {
		//System.out.println("Hello JDBC from Java");
		// STEP 1: on établit une connexion avec la base de données mysql
	    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ams2023db","root","");
	    System.out.println(con);
	    
	    //Lecture des paramètres à partir du clavier
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Donner un nom");
	    String nom = sc.nextLine();
	    
	    System.out.println("Donner la classe");
	    String classe = sc.nextLine();
	    
	    
	   // STEP 2: Création d'un objet statement pour écrire les commandes SQL
	 	Statement stmt = con.createStatement();
	    int result = stmt.executeUpdate("insert into etudiant(nom,classe) values('"+nom+"', '"+classe+"')");
	    System.out.println(result);  // ici j'affiche le nombre d'élement insérer
	    
	    
	    //Code de l'update (Mise à jour)
	 	//String newNom = "Omar Moutari";
	 	//int result = stmt.executeUpdate("update etudiant set nom='"+ newNom+"' where id ='1'");
	 	
	 	//Code delete(suppression)
	 	
	 	//int result = stmt.executeUpdate("delete from etudiant where id ='4'");
	 	
	 	// STEP 3: Création objet ResultSET(table en mémoire) dont le rôle est de stocker le résultat d'une requete select
	 		ResultSet rs = stmt.executeQuery("select id, nom, classe from etudiant");
	 		
	 		// STEP 4: On fait le parcours du ResultSet et on affiche son contenu
	 		
	 		while(rs.next()) {
	 			
	 		int id = rs.getInt("id");
	 		String nom1 = rs.getString("nom");
	 		String classe1 = rs.getString("classe");
	 		System.out.println(id+ " "+nom1 +" "+classe1);
	 		}
	    System.out.println("Fin du programme");

	}

}
