package model.fabriques.chantiers;

import model.bateaux.Bateau;
import model.bateaux.bateaux17e.Bateau2Case17e;
import model.bateaux.bateaux17e.Bateau3Case17e;
import model.bateaux.bateaux17e.Bateau4Case17e;

public class Chantier17e implements Chantier {

	@Override
	public Bateau construireBateau4Case() {
		return new Bateau4Case17e();
	}

	@Override
	public Bateau construireBateau3Case() {
		return new Bateau3Case17e();
	}

	@Override
	public Bateau construireBateau2Case() {
		return new Bateau2Case17e();
	}

}
