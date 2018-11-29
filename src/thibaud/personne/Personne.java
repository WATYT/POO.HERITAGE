package thibaud.personne;

public class Personne {
	
	private String prenom;
	private String nom;
	private int age;
	private String profession;
	
	public Personne(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.profession = "";
	}
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		this.age =  -1;
		this.profession = "";
	}
	
	public Personne(String nom, String prenom, int age, String profession) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.profession = profession;
	}
	
	public String sePresenter() {
		if (this.age != -1) {
			return("Je m'appelle " + this.prenom + " " + this.nom + " j'ai " + this.age + " ans");
		}
			return ("Je m'appelle " + this.prenom + " " + this.nom );
	}
	
	public String getNom() {
		return(this.nom);
	}
	
	public void setProfession(String profession) {
		this.profession = profession;
	}
	

}
