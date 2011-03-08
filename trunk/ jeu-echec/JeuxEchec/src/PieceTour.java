import java.util.ArrayList;
import java.util.List;


public class PieceTour extends Piece {


	public PieceTour(Couleur couleur, Case casePiece, boolean isCapturable) {
		super(couleur, casePiece, isCapturable);
	}


	@Override
	public void capturable() {


	}


	@Override
	public List<Position> typeDeplacement(Case c) {

		Position posCase=c.getPosition();
		int x=posCase.getX();
		int y=posCase.getY();
		List<Position> positionPossibles=new ArrayList<Position>();

		for (int coordX=0;coordX<CONSTANTES.MAX_LIGNE;coordX++){
			if (coordX != x){
				positionPossibles.add (new Position(coordX, y));
			}
		}

		for (int coordY=0;coordY<CONSTANTES.MAX_COL;coordY++){
			if (coordY != y){
				positionPossibles.add (new Position(x,coordY));
			}
		}

		System.out.println("-------Liste des positions possibles-------------"+positionPossibles);

		return positionPossibles;
	}



}
