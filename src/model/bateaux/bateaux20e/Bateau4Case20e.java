package model.bateaux.bateaux20e;

import model.bateaux.Bateau4Cases;

public class Bateau4Case20e extends Bateau4Cases {

	private static String NOM = "Croiseur";
	private static int NB_PROJECTILES = 0;
	private static int POINTS_VIE = 0;
	
	public Bateau4Case20e() {
		super(POINTS_VIE, NB_PROJECTILES, NOM);
	}

}	
