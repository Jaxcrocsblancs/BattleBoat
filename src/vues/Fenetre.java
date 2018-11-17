package vues;

import java.awt.Dimension;

import javax.swing.JFrame;

import model.BatailleNavale;
import model.cases.Case;
import model.plateaux.Plateau;

public class Fenetre extends JFrame {

	public Fenetre(){
		BatailleNavale model = new BatailleNavale();
		
		VuePlateauJoueur vpj = new VuePlateauJoueur(model);
		this.add(vpj);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(Plateau.getNB_LIG()*Case.TAILLE_CASE, Plateau.getNB_COL()*Case.TAILLE_CASE));
		setVisible(true) ;
		this.pack() ;
	}
	
	
	
	
	public static void main(String[] args){
		 new Fenetre();
	}
}
