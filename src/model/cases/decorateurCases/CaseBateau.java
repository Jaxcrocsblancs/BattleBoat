package model.cases.decorateurCases;

import model.bateaux.Bateau;
import model.cases.Case;

public class CaseBateau extends DecorateurCase{

	public Bateau bateau; //a superposer aux autres images des objets decore
	
	public CaseBateau(Case c, Bateau b) {
		super(c);
		this.bateau = b;
	}
	
	@Override
	public boolean touche(){
		//TODO gerer le comportement avec le bateau
		return true;
	}

}
