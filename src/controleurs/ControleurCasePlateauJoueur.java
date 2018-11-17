package controleurs;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import model.BatailleNavale;

public class ControleurCasePlateauJoueur implements ActionListener{

	private BatailleNavale model;
	private int lig;
	private int col;
	
	public ControleurCasePlateauJoueur(BatailleNavale aModel, int aLig, int aCol){
		this. model = aModel;
		this.lig = aLig;
		this.col = aCol;
	}
	
	public static BufferedImage addImage(BufferedImage image1, BufferedImage image2){ 
		Graphics2D g2d = image1.createGraphics(); 
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
		                RenderingHints.VALUE_ANTIALIAS_ON); 
		g2d.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, 
		                RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY); 
	  
		g2d.drawImage(image2, 0, 0, null); 
	  
		g2d.dispose(); 
	  
		return image1 ; 
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Case selectionner: " + this.lig + ", " + this.col);
	}
	
	
}
