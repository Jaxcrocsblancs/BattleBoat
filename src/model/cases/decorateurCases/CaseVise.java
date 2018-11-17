package model.cases.decorateurCases;

import java.awt.Image;

import model.cases.Case;

public class CaseVise extends DecorateurCase{
	
	Image imageVise; //a superposer aux autres images des objets decore
	
	public CaseVise(Case c, Image imgASuperpose) {
		super(c);
		this.imageVise = imgASuperpose;
	}

}
