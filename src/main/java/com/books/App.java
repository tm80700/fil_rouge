package com.books;

import com.books.dao.LivreDao;
import com.books.dao.UtilisateurDao;
import com.books.entity.Livre;
import com.books.entity.Utilisateur;
import com.books.test.TestAvisClient;
import com.books.test.TestCategorie;
import com.books.test.TestCategorieLivre;
import com.books.test.TestCommande;
import com.books.test.TestLigneCommande;
import com.books.test.TestLivre;
import com.books.test.TestUtilisateur;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( " ---- Début des tests ajout -----" );
        System.out.println("");
        
        
  
        // test ajout utilitaire
         TestUtilisateur.ajout();
         
         
         
//         // test suppression utilisateur
//         
//         UtilisateurDao agentUtilisateurDao  = new UtilisateurDao();
//         
//         Utilisateur utilisateur1 = agentUtilisateurDao.rechercheParId(1);
//         
//         agentUtilisateurDao.supprimerUtilisateur(utilisateur1);
         
        		 
         // test ajout utilitaire
         TestUtilisateur.ajout();     
         
       
         
        
        
        // test ajout livre
         TestLivre.ajout();
        
   
        
        // test ajout avis client
        TestAvisClient.Ajout();
        
        
        // test ajout commande
        TestCommande.ajout();
        
        
        // test ajout ligne commande
        TestLigneCommande.ajout();
        
        
        // test ajout categorie
        TestCategorie.ajout();
        
        
        // test ajout categorie livre
        TestCategorieLivre.ajout();;      
        
     
        
         
        System.out.println("");   
        System.out.println( " ---- Fin des tests ajout -----" );

        
        
        System.out.println("");
        System.out.println( " ---- Début des tests recherche -----" );
        System.out.println("");
        
        
        // test recherche livre par id
        
        LivreDao agentLivreDao = new LivreDao();
        Livre livre1 = agentLivreDao.rechercheParId(1);
        float prixLivre = livre1.getPrixLivre();
        System.out.println("Prix du livre = " + prixLivre);
        		
          
        System.out.println("");   
        System.out.println( " ---- Fin des tests recherche -----" );
   
        
        
        
        
    }
}
