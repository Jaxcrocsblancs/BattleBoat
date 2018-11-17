package model.bateaux.bateaux20e;

import model.bateaux.Bateau3Cases;

public class Bateau3Case20e extends Bateau3Cases {

	private static String NOM = "Fregate";
	private static int NB_PROJECTILES = 0;
	private static int POINTS_VIE = 0;
	
	public Bateau3Case20e() {
		super(POINTS_VIE, NB_PROJECTILES, NOM);
	}

}
