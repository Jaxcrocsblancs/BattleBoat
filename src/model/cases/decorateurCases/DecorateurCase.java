package model.cases.decorateurCases;

import model.cases.Case;

public abstract class DecorateurCase extends Case{
	protected Case caseDecore;
	
	public DecorateurCase(Case c){
		this.caseDecore = c;
	}

}
