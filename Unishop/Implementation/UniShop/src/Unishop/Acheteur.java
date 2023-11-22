package Unishop;
import java.util.List;
import java.util.Scanner;

public class Acheteur {
	private String nom;
	private String prenom;
	private  String pseudo;
	private String courrielAdress;
	private String telephone;
	private String expeditionAdress;
	
	
	
	public Acheteur() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public String getPseudo() {
		return pseudo;
	}



	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}



	public String getCourrielAdress() {
		return courrielAdress;
	}



	public void setCourrielAdress(String courrielAdress) {
		this.courrielAdress = courrielAdress;
	}



	public String getTelephone() {
		return telephone;
	}



	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}



	public String getExpeditionAdress() {
		return expeditionAdress;
	}



	public void setExpeditionAdress(String expeditionAdress) {
		this.expeditionAdress = expeditionAdress;
	}



	public void evaluateProduct(String pseudo) {
		String commentaire;
		System.out.println("veuiller laisser un message concernant ce produit...");
		Scanner sc = new Scanner(System.in);
		commentaire = sc.next();	
	}
	

}
