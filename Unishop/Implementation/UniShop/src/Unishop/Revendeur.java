package Unishop;

import java.util.ArrayList;
import java.util.List;

public class Revendeur {
	private  String nom;
	private String adresse;
	private String telephone;
	private String courrielAdress;
	private List<Produit> listeProduit;
	
	
	public Revendeur() {
		super();
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCourrielAdress() {
		return courrielAdress;
	}

	public void setCourrielAdress(String courrielAdress) {
		this.courrielAdress = courrielAdress;
	}

	public List<Produit> getListeProduit() {
		return listeProduit;
	}

	public void setListeProduit(List<Produit> listeProduit) {
		this.listeProduit = listeProduit;
	}

	public void offrirProduit(String titre,String categorie,String description,String nomMarque,String nomModele,int qatInitial,double prix) {
		//Produit p = new Produit(categorie,description,nomMarque,nomModele,qatInitial,prix);
		listeProduit = new ArrayList<Produit>();
		//listeProduit.add(p);
	}
	public String changerEtatCommande(String etat) {
		if(etat == "paiement") {
			return "en production";
		}else if (etat == "pret") {
			return "livraison";
		}else {
			return "livré";
		}
	}
	
	public String confirmationRetour() {
		return "livré";
	}
}
