package model.bateaux;

public abstract class Bateau {

	protected int pointVie;
//	protected int portee;
	protected int nbProjectiles;
	protected int nbCases;
	protected String  nom;
	
	public Bateau(int aPointVie, int aNbProjectiles, int aNbCases, String aNom){
		this.pointVie = aPointVie;
		this.nbProjectiles = aNbProjectiles;
		this.nbCases = aNbCases;
		this.nom = aNom;
	}
	
//	public string getRayon();
}
