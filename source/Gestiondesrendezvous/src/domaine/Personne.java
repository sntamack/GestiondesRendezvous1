package domaine;

public class Personne {
	// ici je fais la declaration de mes attributs
	private String nom;
	private String prenom;
	private String telephone;
	private String adresse;
	// ici fin de la declaration

	// ici se trouve le constructeur sans parametre
	public Personne() {
		super();

	}

	// ici se trouve le constructeur avec parametre
	public Personne(String nom, String prenom, String telephone, String adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.adresse = adresse;
	}

	// ici se trouve les getter et les setter
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

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
