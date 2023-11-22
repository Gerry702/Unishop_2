package Unishop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	
	private static List<Produit> listeDeProduit;
	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String profil;
	     listeDeProduit = new ArrayList<Produit>();
	     Produit p1,p2,p3,p4,p5 ;
	     p1 = new Produit("Avatar","livres et manuels","histoire d'un jeune hero","hamarthan","5",12,2500);
	     p2 = new Produit("maman","livres et manuels","histoire d'un jeune hero","hamarthan","5",12,2500);
	     p3 = new Produit("maths","livres et manuels","histoire d'un jeune hero","hamarthan","5",12,2500);
	     p4 = new Produit("science","livres et manuels","histoire d'un jeune hero","hamarthan","5",12,2500);
	     p5 = new Produit("vol","livres et manuels","histoire d'un jeune hero","hamarthan","5",12,2500);
	     listeDeProduit.add(p1);
	     listeDeProduit.add(p2);
	     listeDeProduit.add(p3);
	     listeDeProduit.add(p4);
	     listeDeProduit.add(p5);
		System.out.println("#############################################Bienvenue dans la plateforme UniShop#############################################");
		System.out.println(" vous vous Inscrivez en tant que acheteur ou revendeur");
		try (Scanner clavier = new Scanner(System.in)) {
			profil = clavier.next();
			if(profil.equals("revendeur")) {
				Revendeur rev = new Revendeur();
				System.out.println("Veuiller entrer vos informations personnelles respectives ci dessus: nom, adresse, numéro de téléphone, adresse courriel");
				rev.setNom(clavier.next());
				rev.setAdresse(clavier.next());
				rev.setTelephone(clavier.next());
				rev.setCourrielAdress(clavier.next());
				System.out.println("combien de produits disposer vous");
				int nbreProduit = clavier.nextInt();
				for(int i = 0; i  < nbreProduit; i++) {
					System.out.println("Veuiller entrer les informations du produit " + (i+1) + " respectivement ci dessus: titre, categorie,description, nom de la marque, nom du modéle, quantite initiale, prix");
					Produit p = new Produit();
					p.setTitre(clavier.next());
					p.setCategorie(clavier.next());
					p.setDescription(clavier.next());
					p.setNomMarque(clavier.next());
					p.setNomModele(clavier.next());
					p.setQuantiteInitiale(clavier.nextInt());
					p.setPrix(clavier.nextDouble());
					listeDeProduit.add(p);
				}
				System.out.println("Votre produit a été enregistré avec succés");
				System.out.println("Vous avez recu une nouvelle Commandes d'un client");
			} else if(profil.equals("acheteur")) {
				Acheteur ach = new Acheteur();
				System.out.println("Veuiller entrer vos informations personnelles respectives ci dessus: nom, prenom, pseudo, adresse courriel, telephone");
				ach.setNom(clavier.next());
				ach.setPrenom(clavier.next());
				ach.setPseudo(clavier.next());
				ach.setCourrielAdress(clavier.next());
				ach.setTelephone(clavier.next());
				System.out.println("Liste de produits disponible");
				for(Produit produit: listeDeProduit) {
					System.out.println(produit.toString());
				}
				List<Produit> panier = new ArrayList<Produit>();

				System.out.println("veuiller passer votre commande de produit en fonction du titre du produit");
				String title = clavier.next();
				System.out.println("combien de produit souhaiter vous avoir");
				int nbre = clavier.nextInt();
				for(int i=0; i < 2; i++) {
					for(Produit produit: listeDeProduit) {
						
						if(produit.getTitre().equals(title)) {
							produit.setQuantiteInitiale(nbre);
							produit.setPrix(produit.getPrix()*nbre);
							panier.add(produit);
						}
					}
				}
				
				
				System.out.println("faites la recherche d'un produit en fonction de son titre");
				String titre = clavier.next();
				for(Produit produit: listeDeProduit) {
					if(produit.getTitre().equals(titre)) {
						System.out.println(produit.toString());
					}
				}
				System.out.println("Laisser un commentaire pour evaluer ce produit");
				String commentaire = clavier.next();
				System.out.println("Votre commentaire: " + commentaire);
				
			}
		}
	}

}
