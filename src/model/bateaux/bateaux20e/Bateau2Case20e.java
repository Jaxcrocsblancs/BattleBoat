package model.bateaux.bateaux20e;

import model.bateaux.Bateau2Cases;

public class Bateau2Case20e extends Bateau2Cases {

	private static String NOM = "Patrouilleur";
	private static int NB_PROJECTILES = 0;
	private static int POINTS_VIE = 0;
	
	public Bateau2Case20e() {
		super(POINTS_VIE, NB_PROJECTILES, NOM);
	}

}
