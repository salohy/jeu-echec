import java.util.Iterator;
import java.util.List;



public class Echiquier {

	private Cases cases;
	
	
	

	public Echiquier(Cases cases) {
		super();
		this.cases = cases;
	}



	public Cases getCases() {
		return cases;
	}
	
	/**
	 * liste des positions jouables sur l'echiquier pour le joueur 
	 * @param joueur
	 * @param piece
	 * @return 
	 */
	public List<Position> positionJouable(Joueur joueur, Piece piece){
		List<Position> listPositionsJouables;
		//case sur laquelle est la piece � jouer
		Case casePiece = piece.getCasePiece();
		//liste des positions possibles pour cette pi�ce
		listPositionsJouables = piece.typeDeplacement(casePiece);
		//TODO: affiner la liste en fonction des cases occup�es
		
		listPositionsJouables=isDeplacementPossible(listPositionsJouables);
		
		return listPositionsJouables; //TODO v�rifier ds le main que le joueur a choisie une position incluse ds la liste
	}
	



	/**
	 * methode qui retourne la case sur laquelle se trouve la piece en parametre
	 * @param piece
	 * @return
	 */
	/*public Case casePiece(Piece piece){
		Case casePiece;
		Position positionPiece = piece.getPosition();
		casePiece = this.cases.getCase(positionPiece);
				
		return casePiece;
	}*/

	/**
	 * methode qui deplace la piece du joueur � la position en param�tre
	 * @param joueur
	 * @param piece
	 * @param position
	 */
	public void deplacementPiece(Joueur joueur, Piece piece, Position positionChoisie){
		
		Case caseChoisie=Cases.getCase(positionChoisie);
		
		if(caseChoisie.isPrise()){
			//v�rif
		}
		
		
	}

}
