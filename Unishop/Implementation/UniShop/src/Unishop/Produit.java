package Unishop;

public class Produit {
	
	private   String titre;
	private String categorie;
	private String description;
	private String nomMarque;
	private String nomModele;
	private int quantiteInitiale;
	private double prix;
	
	

	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Produit(String titre, String categorie, String description, String nomMarque, String nomModele,
			int quantiteInitiale, double prix) {
		this();
		this.titre = titre;
		this.description = description;
		this.nomMarque = nomMarque;
		this.nomModele = nomModele;
		this.quantiteInitiale = quantiteInitiale;
		this.prix = prix;
		
	}


	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNomMarque() {
		return nomMarque;
	}

	public void setNomMarque(String nomMarque) {
		this.nomMarque = nomMarque;
	}

	public String getNomModele() {
		return nomModele;
	}

	public void setNomModele(String nomModele) {
		this.nomModele = nomModele;
	}

	public int getQuantiteInitiale() {
		return quantiteInitiale;
	}

	public void setQuantiteInitiale(int quantiteInitiale) {
		this.quantiteInitiale = quantiteInitiale;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}


	@Override
	public String toString() {
		return "Produit [titre=" + titre + ", categorie=" + categorie + ", description=" + description + ", nomMarque="
				+ nomMarque + ", nomModele=" + nomModele + ", quantiteInitiale=" + quantiteInitiale + ", prix=" + prix
				+ "]";
	}
	
	
	
	
	
}
