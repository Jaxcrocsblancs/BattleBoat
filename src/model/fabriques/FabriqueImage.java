package model.fabriques;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class FabriqueImage {
	
	private static String URL_EAU = "ressources/img/eau.jpg";
	private static String URL_BATEAU = "ressources/img/ennemie.png";


		
	public static ImageIcon getImageIconEau(){
		ImageIcon eau = new ImageIcon(URL_EAU);
		return eau;
	}
	
	public static BufferedImage getImageEau(){
		BufferedImage eau = null;
		try {
			eau = ImageIO.read(new File(URL_EAU));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return eau;
	}
	
	public static BufferedImage getImageBateau(){
		BufferedImage bateau = null;
		try {
			bateau = ImageIO.read(new File(URL_BATEAU));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bateau;
	}

}
