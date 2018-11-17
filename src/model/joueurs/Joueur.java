package model.joueurs;

import model.plateaux.Plateau;
import model.plateaux.PlateauJoueur;
import model.plateaux.PlateauTir;

public class Joueur {

	public Plateau plateauJoueur;
	private Plateau plateauTir;
	
	public Joueur(){
		this.plateauJoueur = new PlateauJoueur();
		this.plateauTir = new PlateauTir();
	}
	
	
	
}
