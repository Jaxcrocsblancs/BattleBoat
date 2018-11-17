package model.cases;

import java.awt.Image;

import model.fabriques.FabriqueImage;

public abstract class Case {

	public static int TAILLE_CASE = 64;
	
	public boolean isClickable(){
		return true;
	}
	
	public boolean touche(){
		return false;
	}
	
	public Image getImage(){
		return FabriqueImage.getImageEau();
	}

}
