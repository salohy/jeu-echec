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
	 * deplacement de la piece du joueur sur l'echiquier
	 * @param joueur
	 * @param piece
	 * @return 
	 */
	public List<Position> positionJouable(Joueur joueur, Piece piece){
		Case casePiece;
		List<Position> listPositionsJouables;
		//case sur laquelle est la piece � jouer
		casePiece = this.casePiece(piece);
		//liste des positions possibles pour cette pi�ce
		listPositionsJouables = piece.typeDeplacement(casePiece);
		//TODO: affiner la liste en fonction des cases occup�es
		
		return listPositionsJouables;
	}
	
	/**
	 * methode qui retourne la case sur laquelle se trouve la piece en parametre
	 * @param piece
	 * @return
	 */
	public Case casePiece(Piece piece){
		Case casePiece;
		Position positionPiece = piece.getPosition();
		casePiece = this.cases.getCase(positionPiece);
				
		return casePiece;
	}

	/**
	 * methode qui deplace la piece du joueur � la position en param�tre
	 * @param joueur
	 * @param piece
	 * @param position
	 */
	public void deplacementPiece(Joueur joueur, Piece piece, Position positionChoisie){
		//TODO: v�rifier si la position est correcte
	}

}
