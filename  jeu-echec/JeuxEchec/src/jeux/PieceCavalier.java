package jeux;
import java.util.List;


public class PieceCavalier extends Piece{


	
	public PieceCavalier(Couleur couleur, boolean isCapturable,
			Joueur proprietaire) {
		super(couleur, isCapturable, proprietaire);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void capturable() {
		
		
	}

	@Override
	public List<Case> typeDeplacement(Case c) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString(){
		if(this.getCouleur()==Couleur.BLANC){
			return "c";
		}else{
			return "C";
		}
	}

	

}
