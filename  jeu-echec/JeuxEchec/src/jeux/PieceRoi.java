package jeux;

import java.util.List;


public class PieceRoi extends Piece {

	
	public PieceRoi(Couleur couleur, boolean isCapturable, Joueur proprietaire) {
		super(couleur, isCapturable, proprietaire);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Case> typeDeplacement(Case c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void capturable() {
		// TODO Auto-generated method stub
		
	}
	
	public String toString(){

		if(this.getCouleur()==Couleur.BLANC){
			return "r";
		}else{
			return "R";
		}
	}


}
