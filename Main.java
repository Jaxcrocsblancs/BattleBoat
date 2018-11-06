import iATactique.TactiqueAleatoire;
import joueur.IA;

public class Main {

	public static void main(String[] args) {
		System.out.println("Debut test");
		IA test = new IA(8);
		test.changeTactique(new TactiqueAleatoire(test));
		for(int i=0; i<10;i++) {
			test.iAJouer();
			System.out.println(test.getPlateauJoueur());
			System.out.println(test.getPlateauTir());
		}
		
	}

}
