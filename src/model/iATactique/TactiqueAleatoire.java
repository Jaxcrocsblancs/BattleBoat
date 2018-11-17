package iATactique;

import joueur.IA;

public class TactiqueAleatoire implements AbstractTactique{

	private IA ia;
	
	public TactiqueAleatoire(IA ia) {
		this.ia = ia;
	}
	
	
	public void tir() {
		int colTir;
		int ligTir ;
		do{
			colTir = (int) (Math.random()*ia.taillePlateau());
			ligTir = (int) (Math.random()*ia.taillePlateau());
		}while(!ia.getPlateauTir().caseDejaTir(colTir, ligTir)) ;
		this.ia.getPlateauTir().tir(colTir,ligTir);
	}

}
