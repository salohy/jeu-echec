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
	public List<Case> positionJouable(Case casePieceAJouer){
		List<Case> listPositionsJouables;
		
		//piece du joueur
		 Piece pieceDuJoueur = casePieceAJouer.getPiece();
		
		 //liste des positions possibles pour cette pièce
		listPositionsJouables = pieceDuJoueur.typeDeplacement(casePieceAJouer);
		
		
		return listPositionsJouables; //TODO vérifier ds le main que le joueur a choisie une position incluse ds la liste
	}
}
