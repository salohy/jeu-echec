import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class PieceTour extends Piece {


	public PieceTour(Couleur couleur, Case casePiece, boolean isCapturable) {
		super(couleur, casePiece, isCapturable);
	}


	@Override
	public void capturable() {


	}


	/*	@Override
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
	}*/




	public List<Position> typeDeplacement(Cases cases) {

		//case de la piece que le joueur a choisi de déplacer
		Case casePiece=this.getCasePiece();
		int x=casePiece.getPosition().getX();
		int y=casePiece.getPosition().getY();

		List<Position> positionPossibles=new ArrayList<Position>();

		for(int i=0; i<Cases.getTabCase().length;i++){


			 

			for (int coordY=0;coordY<CONSTANTES.MAX_COL;coordY++){
				if (coordY != y){

					//on récupère la case avec les coordonnées recu
					Case c=Cases.getCase(new Position(x,coordY));
					if(!c.isPrise()){
						positionPossibles.add (new Position(x,coordY));
					}
				}
			}
		}

		System.out.println("-------Liste des positions possibles-------------"+positionPossibles);

		return positionPossibles;
	}





	public List<Position> isDeplacementPossible(Joueur joueur,List<Position> listPositionsJouables) {

		List<Position> positionPossible;
		List <Piece> piecesDuJoueur=joueur.getPieces();

		for(Iterator i = listPositionsJouables.iterator();i.hasNext();){

			Position posCourante= (Position) i.next();

			//récupération de la case grace a la position
			Case caseCourante=Cases.getCase(posCourante);

			//1 voir si la case courante est prise 
			if(caseCourante.isPrise()){

				//voir si la case prise contient une piece du joueur
				for(Iterator piece = piecesDuJoueur.iterator();piece.hasNext();){

					Piece pieceCourante= (Piece) piece.next();

					//on récupère la case sur laquelle est la piece courante
					Case caseDeLaPiece=pieceCourante.getCasePiece();

					/*vérif si la case de la piece est dans la liste des positions possibles, 
					si oui il ya une piece du joueur a cette pos*/
					if(caseCourante == caseDeLaPiece){
						listPositionsJouables.remove(caseCourante);
					}
				}

			}

		}

		positionPossible=listPositionsJouables;

		return positionPossible;
	}






}
