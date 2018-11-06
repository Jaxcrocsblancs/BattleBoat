package plateau;

public abstract class Plateau {
	Case [][] tabCase;
	
	
	
	public Plateau() {
		
	}
	
	public void initPlateau(int taille) {
		tabCase = new Case[taille][taille];
		for (int i=0; i<taille; i++) {
			for(int j=0; j<taille; j++) {
				tabCase[i][j]= new CaseVide();
			}
		}
	}
	
	
	public String toString() {
		StringBuilder rep = new StringBuilder();
		for (int i=0; i<tabCase.length; i++) {
			for(int j=0; j<tabCase.length; j++) {
				rep.append("["+tabCase[i][j].toString()+"]");
			}
			rep.append("\n");
		}
		return rep.toString();
	}
	
	
}
