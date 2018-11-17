package model;
import java.util.Observable;

import model.fabriques.chantiers.Chantier;
import model.joueurs.Joueur;


public class BatailleNavale extends Observable{

	public Joueur j1;
	private Joueur j2;
	private Chantier chantier;
	
	public BatailleNavale(){
		this.j1 = new Joueur();
		this.j2 = new Joueur();

	}
	
	public void update(){
		setChanged();
		notifyObservers();
		clearChanged();	
	}
	

	
	/************************************* GESTION PLATEAU *************************************/
	
	
	
	/************************************* GESTION JOUEUR *************************************/

	public boolean j1Tir(int col, int lig){
		return false;
	}
	
	public boolean j2Tir(int col, int lig){
		return false;
	}
	
	/************************************* GESTION CHANTIER *************************************/


	
}
