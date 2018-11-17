package model.fabriques.chantiers;

import model.bateaux.Bateau;
import model.bateaux.bateaux20e.Bateau2Case20e;
import model.bateaux.bateaux20e.Bateau3Case20e;
import model.bateaux.bateaux20e.Bateau4Case20e;

public class Chantier20e implements Chantier {

	@Override
	public Bateau construireBateau4Case() {
		return new Bateau4Case20e();
	}

	@Override
	public Bateau construireBateau3Case() {
		return new Bateau3Case20e();
	}

	@Override
	public Bateau construireBateau2Case() {
		return new Bateau2Case20e();
	}

}
