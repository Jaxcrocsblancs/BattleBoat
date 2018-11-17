package vues;

import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.Observable;
import java.util.Observer;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import controleurs.ControleurCasePlateauJoueur;

import model.BatailleNavale;
import model.fabriques.FabriqueImage;
import model.plateaux.Plateau;

public class VuePlateauJoueur extends JPanel implements Observer {

	private JButton[][] plateauBoutons;
	private BatailleNavale model;
	
	public VuePlateauJoueur(BatailleNavale aModel){
		this.model = aModel;
		
		this.setLayout(new GridLayout(Plateau.getNB_LIG(), Plateau.getNB_COL()));
		
		this.plateauBoutons = new JButton[Plateau.getNB_LIG()][Plateau.getNB_COL()];
		for(int lig=0; lig<Plateau.getNB_LIG(); lig++){
			for(int col=0; col<Plateau.getNB_COL(); col++){
				final int tlig = lig;
				final int tcol = col;
				this.plateauBoutons[lig][col] = new JButton(FabriqueImage.getImageIconEau());
				this.plateauBoutons[lig][col].addActionListener(new ControleurCasePlateauJoueur(this.model, lig, col));
				this.plateauBoutons[lig][col].addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						System.out.println(tlig + ", " + tcol);
						selectionCase(tlig, tcol);
						
					}
				});
				
				this.add(this.plateauBoutons[lig][col]);
			}
		}
		
		this.model.addObserver(this);
	}
	
	/**
	 * @param image1
	 * @param image2
	 * @return une image, superposition des deux images
	 */
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
	
//	public ImageIcon switchImage(){
//		
//	}
	
	public void selectionCase(int lig, int col){
		BufferedImage superposition;
		//TODO cause des erreurs du a l'acces static ?
		superposition = this.addImage(FabriqueImage.getImageEau(), FabriqueImage.getImageBateau());
		ImageIcon test = new ImageIcon(superposition);
		this.plateauBoutons[lig][col].setIcon(test);
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {

	}

}
