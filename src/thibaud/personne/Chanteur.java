package thibaud.personne;

public class Chanteur extends Personne {
	
	private String maisonEdition ;
	
	public Chanteur(String nom, String prenom, int age) {
		super(nom,prenom, age);
		super.setProfession("Chanteur");
		
	}
	public Chanteur() {
		super("","",-1);
		super.setProfession("Chanteur");
	}
	
	public String sePresenter() {
		return(super.sePresenter() + " et je suis chanteur");
	}
	
	public void setEdition(String maisonEdition) {
		this.maisonEdition = maisonEdition ;
	}
	
	public String getEdition() {
		if(this.maisonEdition != null) {
			return(this.maisonEdition);
		}
		else {
			return("");
		}
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maisonEdition == null) ? 0 : maisonEdition.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chanteur other = (Chanteur) obj;
		if (maisonEdition == null) {
			if (other.maisonEdition != null)
				return false;
		} else if (!maisonEdition.equals(other.maisonEdition))
			return false;
		return true;
	}
	
	
}
