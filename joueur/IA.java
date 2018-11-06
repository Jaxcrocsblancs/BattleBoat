package joueur;

import iATactique.AbstractTactique;
import plateau.PlateauJoueur;
import plateau.PlateauTir;

public class IA {
	private PlateauJoueur plateauA;
	private PlateauTir plateauE;
	private AbstractTactique tactique;
	
	public IA(int taille) {
		plateauA = new PlateauJoueur();
		plateauE = new PlateauTir();
		this.initPlateaux(taille);
		
	}
	
	public void changeTactique(AbstractTactique tactique) {
		this.tactique = tactique;
	}
	
	
	private void initPlateaux(int taille) {
		this.plateauA.initPlateau(taille);
		this.plateauE.initPlateau(taille);
	}
	
	public void iAJouer() {
		this.tactique.tir();		
	}

	public double taillePlateau() {
		return plateauA.getTaille();
	}

	public PlateauTir getPlateauTir() {
		return plateauE;
	}
	
	public PlateauJoueur getPlateauJoueur() {
		return plateauA;
	}
	
}
