package jeux;
import java.util.ArrayList;
import java.util.List;


public class PiecePion extends Piece {


	public PiecePion(Couleur couleur, boolean isCapturable, Joueur proprietaire) {
		super(couleur, isCapturable, proprietaire);
	}

	@Override
	public List<Case> typeDeplacement(Case casePieceADeplacer) {
		
		List<Position> positionPossibles=new ArrayList<Position>();
		//premier deplacement
		if(casePieceADeplacer.getPosition().getX()==1){
			
			positionPossibles=Deplacement.deplacementVertical(casePieceADeplacer.getPosition(), true);
			
			
		}
		
		return null;
	}

	@Override
	public void capturable() {
		// TODO Auto-generated method stub
		
	}

	public String toString(){

		if(this.getCouleur()==Couleur.BLANC){
			return "p";
		}else{
			return "P";
		}
	}
}
