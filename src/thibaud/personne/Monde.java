package thibaud.personne;

import java.util.ArrayList;

public class Monde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personne p1 = new Personne("gouit", "jl");
		Personne p2 = new Personne("waty", "theophane",12);
		Chanteur c = new Chanteur("Haliday", "Johnny", 98);
		Personne p3 = new Personne("Gims", "Maitre", 66);
		p3=c;
		((Chanteur)p3).setEdition("17");
		
		MaisonEdition m1 = new MaisonEdition("BAM",new ArrayList<Chanteur>());
		
		System.out.println(p1.sePresenter());
		System.out.println(p2.sePresenter());
		System.out.println(p1.getNom());
		System.out.println(c.sePresenter());
		System.out.println(c.getNom());
		System.out.println(((Chanteur)p3).getEdition());
		
		m1.ajouterChanteur(c);
		

	}

}
