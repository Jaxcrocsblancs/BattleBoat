package model.plateaux;

import java.util.ArrayList;

import model.bateaux.Bateau;
import model.cases.Case;
import model.cases.CaseConcrete;

public abstract class Plateau {

	protected Case[][] plateau;
	protected ArrayList<Bateau> bateaux;
	
	private static int LIG_DEFAUT = 10;
	private static int COL_DEFAUT = 10;
	private static int NB_COL;
	private static int NB_LIG;

	
	public Plateau(){
		NB_LIG = LIG_DEFAUT;
		NB_COL = COL_DEFAUT;
		
		this.plateau = new Case[NB_LIG][NB_COL];
		for(Case[] cTab: this.plateau){
			for(Case c: cTab){
				c = new CaseConcrete();
			}
		}
	}
	
	
	/************************************* GESTION LIG / COL *************************************/

	
	public static int getCOL_DEFAUT(){
		return COL_DEFAUT;
	}
	
	public static int getLIG_DEFAUT(){
		return LIG_DEFAUT;
	}
	
	public static int getNB_COL(){
		return NB_COL;
	}
	
	public static int getNB_LIG(){
		return NB_LIG;
	}
	
	/************************************* GESTION CASE *************************************/

	public Case getCase(int lig, int col){
		return this.plateau[lig][col];
	}
	
	/************************************* ABSTRACT METHOD *************************************/
	
	public abstract void selectionCase();
	
}
