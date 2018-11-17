package model.cases.decorateurCases;

import model.cases.Case;

public class ClickableFalse extends DecorateurCase{

	public ClickableFalse(Case c) {
		super(c);
	}

	@Override
	public boolean isClickable(){
		return false;
	}
	
}
