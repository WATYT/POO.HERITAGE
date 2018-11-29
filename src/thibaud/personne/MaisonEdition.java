package thibaud.personne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class MaisonEdition {
	
	private String nom;
	private List chanteurs = new ArrayList();
	
	
	public MaisonEdition(String nom, ArrayList<Chanteur> chanteurs) {
		this.nom = nom;
		this.chanteurs = chanteurs;
	}
	
	public void ajouterChanteur(Chanteur chanteur){
		
		chanteurs.add(chanteur);
	}
	
	public void trierChanteur() {
		Collections.sort(chanteurs);
	}

}
